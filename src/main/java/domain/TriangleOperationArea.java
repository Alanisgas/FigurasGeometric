package main.java.domain;

public class TriangleOperationArea {
    public static double calculateArea(IShape iShape){
        double total= iShape.area();
        System.out.println("total area Triangle = " + total);
        return total;
    }

}
