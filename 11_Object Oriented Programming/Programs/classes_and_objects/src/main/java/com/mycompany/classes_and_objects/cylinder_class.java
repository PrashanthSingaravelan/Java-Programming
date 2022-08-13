package com.mycompany.classes_and_objects;

class rectangle {
    double radius;
    double height;
    
    public double lid_area() { return (Math.PI * radius * radius); }
    
    
    double totalsurfacearea() {
        double top_bottom = 2 * (Math.PI * radius * radius);
        double wall = lid_area() * height;
        return (top_bottom + wall);
    }
    
    double volume() { return (lid_area() * height); }
    
}

public class cylinder_class {
    public static void main(String args[]) {
        rectangle obj1 = new rectangle();
        obj1.radius = 2;
        obj1.height = 5;
        
        System.out.println("Lid Area : " + obj1.lid_area());
        System.out.println("Total Surface Area : " + obj1.totalsurfacearea());
        System.out.println("Volume : " + obj1.volume());
    }
}
