package domain;

import jakarta.persistence.Entity;


public class Circle extends GeometricFigures implements IShape{
    private final double PI=3.1416182022;
    private double radio;
    private  int id;
    public Circle(double radio){
        this.radio= radio;
    }
    public Circle(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getRadio() {
        return radio;
    }


    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getPI() {
        return PI;
    }

    @Override
    public double area() {
        return PI*(radio*radio);
    }

    @Override
    public double perimeter() {
        return radio*2*PI;
    }
}
