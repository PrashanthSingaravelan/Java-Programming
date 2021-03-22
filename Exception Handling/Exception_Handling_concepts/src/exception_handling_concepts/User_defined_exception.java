package exception_handling_concepts;

class LowBalanceException extends Exception {
    public String toString() {
        return "Balance should not be less than 5000";
    }
}

public class User_defined_exception {
static void fun1() {
    try {
        throw new LowBalanceException();
    }
    catch (LowBalanceException obj){
            System.out.println(obj);
    }
}
        
static void fun2()    {  fun1();  }
        
static void fun3()    {  fun2();  }

public static void main(String args[]) {
            fun3();
}
}
