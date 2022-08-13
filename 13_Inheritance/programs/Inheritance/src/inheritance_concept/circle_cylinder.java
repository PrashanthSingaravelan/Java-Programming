package inheritance_concept;

class Circle {
    public double radius;
    public double area()                {      return Math.PI * radius * radius;   }
    public double perimeter()           {      return 2*Math.PI*radius;    }
    public double Circumference()       {      return perimeter();    }
}

class Cylinder extends Circle   {
    public double height;
    public double volume()          {   return area()*height;  /*volume --> [area of a circle(pi*r*r)] * h    */    }
}

public class circle_cylinder {
    public static void main(String[] args) {
         Cylinder obj1 = new Cylinder();
                obj1.radius = 7;
                obj1.height = 10;
                System.out.println("Volume of a cylinder is : " + obj1.volume());
                System.out.println("Area of a cylinder is      : " + obj1.area());
    }
}




