package inheritance;
public class program_3 {
    
    public static class A { int i = 10; }
    public static class B extends A{ int i = 20; }
    
    public static void main(String[] args) {
        A a = new B();
        System.out.println(a.i);
        
        float num1 = (float) 10.222222;
        System.out.printf("%.2f",num1);
    }
}
