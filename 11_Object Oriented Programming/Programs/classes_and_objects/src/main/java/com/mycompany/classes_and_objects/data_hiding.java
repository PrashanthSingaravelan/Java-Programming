package com.mycompany.classes_and_objects;

class rectangle {
    private double length;
    private double breadth;
    
    public void set_data(double l, double b) {
        if (l>0 && b>0) {
            length = l;
            breadth = b;
        }
    }
    
    public double get_length() { return length; }
    public double get_breadth() { return breadth; }
    
    public double area() { return get_length() * get_breadth(); }
    
    public double perimeter() { return 2*(get_length() + get_breadth()); }
    
    public boolean isSquare() {
        if (length == breadth) 
            return true;
        else
            return false;
    }
    
}

public class data_hiding {
    public static void main(String[] args) {
        rectangle obj1 = new rectangle();
        obj1.set_data(10,20);
        System.out.println("Area : " + obj1.area());
        System.out.println("Perimter : " + obj1.perimeter());
        System.out.println("IS Square : " + obj1.isSquare());
    }
    
}
