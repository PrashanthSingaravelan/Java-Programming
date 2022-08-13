package exception_handling_concepts;

public class propagation_of_exception {
    static int method1() { return 10/0; }
    static void method2() {  method1();  }
    static void method3() {  
        try {
            method2();  }
        catch(Exception obj)  {
                System.out.println(obj);
        }
    }
    
    public static void main(String args[]) {
        method3();
    }
}
