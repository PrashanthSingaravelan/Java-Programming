package basics_class_objects;
public class anonymous_object {

public static class calculation{
            int fact = 1;
            void fact(int n) {
                for(int i=1;i<=n;i++) {
                    fact = fact * i;    }
            System.out.println("The factorial of " + n + "is : " + fact);    
            }
    }
    
    public static void main(String args[]) {
        new calculation().fact(5);
    }    
}
