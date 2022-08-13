package inheritance;

class Super {
    public void meth1() { System.out.println("Super Method-1"); }
    
    public void meth2() { System.out.println("Super Method-2"); }
}

class Sub extends Super {
    @Override
    public void meth2() { System.out.println("Sub Method-2"); }
    
    public void meth3() { System.out.println("Sub Method-3"); }
}

public class dynamic_dispatch_method {
    public static void main(String args[]) {
        Super obj1 = new Sub();
        obj1.meth1();
        obj1.meth2();
    }
}
