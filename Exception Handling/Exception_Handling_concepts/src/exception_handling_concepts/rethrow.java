package exception_handling_concepts;

class re_throw_exception extends Exception {    public String toString() { return "good"; }     }
        
class sample2 {
    void fun2() throws re_throw_exception {        throw new re_throw_exception();             }
}

class sample {
          void fun1() throws re_throw_exception {     
                sample2 obj1_sample2 = new sample2();
                try { obj1_sample2.fun2(); }        catch(Exception e)        { throw e;     }
          }
 }

public class rethrow {
public static void main(String args[]) {
           sample obj1 = new sample();
          try {   obj1.fun1(); }
          catch(Exception e)        { System.out.println(e);     }
    }
}
