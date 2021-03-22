package exception_handling_concepts;
import java.util.Random;

public class Exception_Handling_concepts {
public static void main(String[] args) {
            int a=0,b=0,c=0;
            Random r = new Random();
            try   {
                        b = r.nextInt();
                        c = r.nextInt();
                        a = 12345 / (b/c);
                        System.out.println("Value b : "+b);
                        System.out.println("Value c : "+c);
                        System.out.println("Division Successfull");
                    }
            catch (ArithmeticException e) {
                        System.out.println("Exception  : " + e );
                        System.out.println("Value b : "+b);
                        System.out.println("Value c : "+c);
                        System.out.println("Division Not Successfull");
                        a = 0;
                    }
           System.out.println("a : " + a);
    }
}
