package com.mycompany.abstract_class;

abstract class shape {
    abstract public double perimeter();
    abstract public double area();
}

class circle extends shape {
    double radius;
    
    @Override
    public double perimeter() { return 2 * Math.PI * radius; }
    
    @Override
    public double area()      { return Math.PI * radius * radius; }
}

class rectangle extends shape {
    double length;
    double breadth;
    
    @Override
    public double perimeter() { return (2*(length + breadth)); }
    
    @Override
    public double area()     { return (length*breadth); }
}


public class example_1 {
    public static void main(String args[]) {
        rectangle obj1 = new rectangle();
        obj1.length  = 10.0;
        obj1.breadth = 5.12;
        
        shape obj_1 = obj1;
        System.out.println("Perimeter of a rectangle : " + obj_1.perimeter());
        
        circle obj2 = new circle();
        obj2.radius  = 10.0;
        
        shape obj_2 = obj2;
        System.out.println("Area of a circle : " + obj_2.area());
    }
}
