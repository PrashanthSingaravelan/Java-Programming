package com.company;

public class Main {

    public static void main(String[] args) {
	  Cylinder obj1 = new Cylinder();
	  obj1.radius = 7;
	  obj1.height = 10;
		System.out.println("Volume of a cylinder is : " + obj1.volume());
		System.out.println("Area of a cylinder is : " + obj1.area());
    }
}
