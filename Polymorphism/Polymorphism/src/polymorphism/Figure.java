package polymorphism;
public class Figure {
    
    public static class basic_figure {
        double dim1;
        double dim2;
        
        basic_figure(double a,double b) {       // parameterized constructor
            this.dim1 = a;
            this.dim2 = b;
        }
        
        double area() {
            System.out.println("Area for the figure is undefined");
            return 0;
        }
    }
    
    public static class rectangle extends basic_figure {
        rectangle (double a, double b) {             // parameterized constructor
            super(a,b);  // The super() in Java is a reference variable that is used to refer parent class constructors.
            // So a and b of the rectangle is passed from the main. 
            // These a and b are copied to dim1 and dim2 using constructor.
            // This constructor is defined in the parent class.
            
        }
        double area() {
            System.out.println("Inside the rectangle class");
            return this.dim1 * this.dim2;
        }
    }
    
    public static class triangle extends basic_figure {
        triangle (double a, double b) {                 // parameterized constructor
            super(a,b);
        }
        double area() {
            System.out.println("Inside the rectangle class");
            return this.dim1*this.dim2/2;
        }
    }    

public static void main(String args[]) {
                    basic_figure obj1 = new basic_figure(5,2);
                    rectangle obj2      = new rectangle(10,2);
                    triangle obj3         = new triangle(5,6);
                    
                    basic_figure reference ; 
                    
                    reference = obj1;
                    System.out.println("Area  : " + reference.area());
                    
                    reference = obj2;
                    System.out.println("Area of rectangle : " + reference.area());
                    
                    reference = obj3;
                    System.out.println("Area of triangle : " + reference.area());
    }
}

