package exception_handling_concepts;

public class nested_try {
    public static void main(String args[]) {
        int A[] = {30,40,50,60,0};
        
        try 
                { 
                        int c = A[3]/A[0];
                        System.out.println("Division is "+c);

                        try {
                            System.out.println("A[5] : " + A[5]);   
                        }
                        catch(ArrayIndexOutOfBoundsException e) {
                                    System.out.println("Index is invalid");
                        }
                }
            
            catch(ArithmeticException e) {
                System.out.println("Denominator should not be 0");
         }
            System.out.println("Game Over");
    }
}
