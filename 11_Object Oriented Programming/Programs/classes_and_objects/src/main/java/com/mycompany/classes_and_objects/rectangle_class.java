package com.mycompany.classes_and_objects;

class Rectangle {
    double length;
    double breadth;
    
    public double area()      { return length * breadth; }
    
    public double perimeter() { return 2*(length + breadth); }
    
}

public class rectangle_class {
    public static void main(String[] args) {
        Rectangle obj1 = new Rectangle();
        obj1.length = 10;
        obj1.breadth = 10;
        
        System.out.println("Area of a circle : " + obj1.area());
        System.out.println("Perimeter of a circle : " + obj1.perimeter());
    }
}
