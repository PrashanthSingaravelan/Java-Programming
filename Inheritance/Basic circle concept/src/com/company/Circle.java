package com.company;

public class Circle {
    public double radius;

    public double area() {
        return Math.PI * radius * radius;
    }

    public double perimeter() {
        return 2*Math.PI*radius;
    }

    public double Circumference() {
        return perimeter();
    }



}
