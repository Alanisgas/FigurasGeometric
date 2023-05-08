package domain;

public class TriangleOperationPerimeter {
    public static double calculatePerimeter(Triangle iShape){
        double total= iShape.perimeter();
        System.out.println("total Perimeter Triangle = " + total);
        return total;
    }
}
