package inheritance;

class Super {
    public void display() { System.out.println("Super class Display"); }
}

class Sub extends Super {
    @Override
    public void display() { System.out.println("Sub class Display");   }
}

public class method_overriding {
    public static void main (String[] args) {
        Super obj1 = new Super();
        Sub obj2   = new Sub();
        
        obj1.display();
        obj2.display();
    }
}
