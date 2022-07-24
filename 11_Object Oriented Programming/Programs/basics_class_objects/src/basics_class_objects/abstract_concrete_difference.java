package basics_class_objects;
public class abstract_concrete_difference {
    
public static abstract class Super {
        Super() {                    // Default constructor
            System.out.println("Super class Constructor of the abstract class");      }
        void method1() {    // Normal method of the abstract class
            System.out.println("Normal method (Method-1) of normal class (Super) defined in abstract class");
        }
        abstract void method2();    // this method must be defined only in the concrete class
}

public static class Concrete extends Super {
    // Over-riding the abstract method (method-2) of the method class
    void method2() {
        System.out.println("abstract method (Method-2) of abstract class (Super) defined in concrete class");    }
}

public static void main(String args[]) {
        Super obj1 = new Concrete();  // With abstract class reference we can make the concrete class object
        obj1.method1();
        obj1.method2();        
    }
}
