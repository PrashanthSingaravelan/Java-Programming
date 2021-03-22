package interface_practice;

interface Test
{
    void method1();
    void method2();
}

class Test1 implements Test {
        public void method1() {
            System.out.println("Method-1 of Test class");
        }
        
        public void method2() {
            System.out.println("Method-2 of Test class");
        }
        
        public void method3() {
            System.out.println("Method-3 of Test class");
        }        
}

public class Interface_practice {
public static void main(String[] args) {
           Test obj1 = new Test1();  
           // The reference of the interface can hold the object of a class which is implementing that interface
           
           // we achieved dynamic dispatch method (i.e) run-time polymorphism. Interfces are meant to achieve run-time polymorphism
           obj1.method1();   
           obj1.method2();           
    }
}
