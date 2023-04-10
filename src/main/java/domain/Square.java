package main.java.domain;

public class Square extends GeometricFigures implements IShape{
    protected double side;
     public Square(){

     }
    public Square(double side){

         this.side=side;
     }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }


    @Override
    public double area() {

        return side*4;
    }

    @Override
    public double perimeter() {
        return side*2;
    }
}
