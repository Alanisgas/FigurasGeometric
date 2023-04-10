package main.java.domain;

public class CircleOperationArea {

    public static double calculateArea(IShape iShape){
        double total= iShape.perimeter();
        System.out.println("total circle = " + total);
        return total;

    }

}
