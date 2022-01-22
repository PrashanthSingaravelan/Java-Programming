package lambda_expressions_concept;

@FunctionalInterface
interface mylambda_1 {
    public void display(String str1);
}

public class single_parameter {
    public static void main(String[] args) {
         mylambda_1 obj1 = 
                    (s) -> {
                        System.out.println(s);    // s represents str1 
                 };
         obj1.display("This is Prashanth");
         
          mylambda_1 obj2 = 
                    (s2) -> {
                        System.out.println(s2);    // s represents str1 
                 };
         obj2.display("This is Kumar");
         
    }
}
