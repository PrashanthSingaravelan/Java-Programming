package exception_handling_concepts;
import java.io.*;

public class checked_unchecked_exception {
static void fun1() {
    try {
            // FileInputStream fi = new FileInputStream('My.txt'); --> checked exception
            System.out.println(10/0);
    }
    
    catch (Exception obj){ 
        System.out.println(obj.getMessage());
        obj.printStackTrace();
    }
}
        
 static void fun2()     {      fun1();     }
        
static void fun3()      {    fun2();     }

public static void main(String args[])          {    fun3();     }
        
}
