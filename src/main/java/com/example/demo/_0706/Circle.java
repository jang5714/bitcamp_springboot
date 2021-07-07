package com.example.demo._0706;

public class Circle {
    final double PI = 3.14;
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double area(double rad) {
        double result = rad * rad * PI;
        return result;
    }

    public double aa(Circle ci) {
        double result = ci.radius * ci.radius * PI;
        return result;

    }
}
