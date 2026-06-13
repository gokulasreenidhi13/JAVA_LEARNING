package com.example.interf;

public class sphere implements Shape1, Shape2 {

    double radius = 5.6;

    @Override
    public void volume() {
        double result = (4.0 / 3.0) * pi * radius * radius * radius;
        System.out.println("Volume of Sphere = " + result);
    }

    @Override
    public void area() {
        double result = 4 * pi * radius * radius;
        System.out.println("Surface Area of Sphere = " + result);
    }
}