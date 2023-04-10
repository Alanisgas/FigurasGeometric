package main.java.domain;

public class Triangle extends GeometricFigures implements IShape{
    private double base;
    private double height;
    private  double side;
    public Triangle(double base, double height){
        this.base= base;
        this.height= height;

    }
    public Triangle(){

    }
    public Triangle(double side){
        this.side=side;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }


    @Override
    public double area() {
        return base* height;
    }

    @Override
    public double perimeter() {
        return side*3;
    }
}
