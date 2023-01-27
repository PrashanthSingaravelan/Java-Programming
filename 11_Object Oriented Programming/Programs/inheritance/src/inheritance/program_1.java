public class Main {

public static class Base {
    public void foo() {  System.out.println("Base' foo is called"); }
}

public static class Derived extends Base {
    private void foo() {  System.out.println("Derived's foo is called");  } 
}
    
public static void main(String[] args) {
    
    Base base_obj1 = new Base();
    base_obj1.foo();
    
    Base base_obj2 = new Derived(); 
    base_obj2.foo(); // Base's foo ()is over-ridden by Derived's foo()
    
    Derived derive_obj1 = new Derived();
    derive_obj1.show(); // Base's foo ()is over-ridden by Derived's foo()
    }
}