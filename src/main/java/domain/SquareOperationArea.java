package main.java.domain;

public class SquareOperationArea {
    public static double calculateArea(Square square) {
        double total = square.getSide()*4;
        System.out.println("total area Squere = " + total);
        return  total;
    }
}
