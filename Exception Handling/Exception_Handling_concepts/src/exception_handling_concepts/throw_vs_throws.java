package exception_handling_concepts;

class NegativeDimensionException extends Exception {
        public String toString() {
            return "Dimensions of a triangle cannot be negative";
        }
 }

public class throw_vs_throws {
    
    static int area(int l,int b) throws NegativeDimensionException {
        if (l<0 || b<0) {
            throw new NegativeDimensionException();
        }
        else {
             return l*b;  }
    }
    
    static void method1() throws NegativeDimensionException{
        System.out.println("Area is : " + area(-10,5));
    }

public static void main(String args[])  {
           try{
               method1();
           }
           catch(NegativeDimensionException obj) {
               System.out.println(obj);
           }
    }
}
