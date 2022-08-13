package com.mycompany.classes_and_objects;

 class circle {
        public double radius;
        
        public double area() {
            return (Math.PI * radius * radius);
        }
        public double perimeter() {
            return (2*Math.PI*radius);
        }
        
        public double circumference() {
            return perimeter();
        }
        
    }


public class circle_class {
    public static void main(String[] args){
        circle obj1 = new circle();
        obj1.radius = 10;
        System.out.println("Area of circle is : " + obj1.area());
        System.out.println("Perimeter of circle is : " + obj1.perimeter());
        System.out.println("Circumference of circle is : " + obj1.circumference());
    }
}
