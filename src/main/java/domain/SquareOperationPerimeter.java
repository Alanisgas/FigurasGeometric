package main.java.domain;

public class SquareOperationPerimeter {
    public static double calculatePerimeter(Square square){
        double totalPerimeter= square.getSide()*2;
        System.out.println("totalPerimeter Squere = " + totalPerimeter);
        return totalPerimeter;
    }
}
