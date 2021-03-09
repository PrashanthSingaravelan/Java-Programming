package polymorphism;
public class Polymorphism {

        public static class First {
            void callme() {
                System.out.println("Inside First method");  }
        }
            
        public static class Second extends First{      //Second  inheriting First class
             void callme() {
                System.out.println("Inside Second method");  }
        }
             
        public static class Third extends First{      //Third  inheriting First class
             void callme() {
                System.out.println("Inside Third method");  }
         }
    
   public static void main(String[] args) {
            First obj1 = new First();               // object of type first
            Second obj2 = new Second();     // object of type second
            Third obj3 = new Third();           // object of type third
            
            First  reference;  //   creating a reference to the First class
            
            reference = obj1;
            reference.callme();    // calling First's version of callme
            
            reference = obj2;
            reference.callme();    // calling Second's version of callme
            
            reference = obj2;
            reference.callme();    // calling Third's version of callme
    }
}
