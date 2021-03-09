package com.company;

public class Cylinder extends Circle{
    public double height;
    public double volume() {
        return area()*height;  /*volume --> [area of a circle(pi*r*r)] * h    */
    }
}
