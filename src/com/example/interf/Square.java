package com.example.interf;

public class Square implements Shape1 {

    double radius;

    public Square(double r) {
        this.radius = r;
    }

    @Override
    public void area() {
        double result = radius * radius;
        System.out.println("Area = " + result);
    }
}