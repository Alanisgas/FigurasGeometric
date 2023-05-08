package client;

import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CircleClient {
    public void clientRequest(){
    DefaultHttpClient httpClient= new DefaultHttpClient();
    HttpGet getRequest = new HttpGet(
            "http://localhost:8080/circle");
    getRequest.addHeader("accept","app/json");

        HttpResponse response = null;
        try {
            response = httpClient.execute(getRequest);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        if(response.getStatusLine().getStatusCode()!=200){
        throw new RuntimeException("Failed : HTTP error code :"+ response.getStatusLine().getStatusCode());
    }
        try {
            BufferedReader br = new BufferedReader(
                    new InputStreamReader((response.getEntity().getContent()))
            );
            String output;
            System.out.println("Out from Server........");
            while ((output = br.readLine())!=null){
                System.out.println(output);
            }
            httpClient.getConnectionManager().shutdown();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }



    }
}