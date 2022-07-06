import java.lang.*;
import java.util.*;

class program_2
{
    public static void main(String args[])
    {
        Scanner obj1 = new Scanner(System.in);

        int a,b,c;
        System.out.println("Enter two numbers : ");
        a = obj1.nextInt();
        b = obj1.nextInt();
        c = a + b;
        System.out.println("The Sum is : " + c);

        Scanner obj2 = new Scanner(System.in);
        
        System.out.println("What is your name???");
        String str1 = obj2.nextLine();                 // reads the string input
        System.out.println("Your name is : " + str1);

        System.out.println("What is your aim???");
        String str2 = obj2.next();                    //reads string before the space  
        System.out.println("Your aim is : " + str2);
    }
}
