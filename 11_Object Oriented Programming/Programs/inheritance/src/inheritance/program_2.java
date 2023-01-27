public class Main {

public static class Base {
    public void show() { System.out.println("Base:show() called"); }
}

public static class Derived extends Base {
    final public void show() { System.out.println("Derived:show()called"); }
}
    
public static void main(String[] args) {
    
    Base base_obj1 = new Base();
    base_obj1.show();
    
    Base base_obj2 = new Derived(); 
    base_obj2.show(); // Base's show ()is over-ridden by Derived's show()
    
    Derived derive_obj1 = new Derived();
    derive_obj1.show(); // Base's show ()is over-ridden by Derived's show()
    }
}