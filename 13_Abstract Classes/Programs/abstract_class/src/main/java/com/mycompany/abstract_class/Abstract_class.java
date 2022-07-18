package com.mycompany.abstract_class;

abstract class Super {
    public Super() { // Default constructor
        System.out.println("Super Constructor");
    }
    
    public void method1() {
        System.out.println("Method-1 of Super");
    }
    
    abstract public void method2();
}

class Sub extends Super {
    @Override
    public void method2() {
        System.out.println("Method-1 of Sub");
    }
}

public class Abstract_class {

    public static void main(String[] args) {
        Super obj1 = new Sub();
        obj1.method1();
        obj1.method2();
    }
}
