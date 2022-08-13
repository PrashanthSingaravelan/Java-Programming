package lambda_expressions_concept;

@FunctionalInterface
interface mylambda_2 {
    public int add(int x,int y);
}

public class multiple_parameters {
    public static void main(String[] args) {
         mylambda_2 obj1 = 
                 (p,q) -> { 
                        return (p+q);
                 };
         System.out.println("The sum is : " + obj1.add(10,20));
         
         mylambda_2 obj2 =  (p,q) ->  (p+q);
          System.out.println("The sum is : " + obj2.add(10,20));      
    }
}
