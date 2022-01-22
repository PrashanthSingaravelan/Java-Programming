package exception_handling_concepts;

public class finallydemo_1 {
    public static void main(String args[]) {
        try {
            System.out.println("Answer is : " + 10/0); 
        }
        catch(Exception obj) {
            System.out.println("Exception : " + obj);
        }
        System.out.println("Final message");
    }
}
