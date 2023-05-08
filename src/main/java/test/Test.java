package test;

import db.CircleBd;
import domain.*;

import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.boot.SpringApplication;

public class Test {
    public static void main(String[] args) {
        SpringApplication.run(Test.class, args);



        Circle circle= new Circle(5);
        double areaCircle = CircleOperationArea.calculateArea(circle);
        double perimeterCircle = CircleOperationPerimeter.calculatePerimeter(circle);
        Square square= new Square(2);

        double areasquere= SquareOperationArea.calculateArea(square);
        double perimeter = SquareOperationPerimeter.calculatePerimeter(square);
        Triangle triangle = new Triangle(2,3);
        Triangle triangle1= new Triangle(5);
        double area = TriangleOperationArea.calculateArea(triangle);
        area= TriangleOperationPerimeter.calculatePerimeter(triangle1);

    }

}