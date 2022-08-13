package inheritance_concept;

class A {
            int i, j;
            void showij()   {   System.out.println("\ni and j: " + i + " " + j);      }
}

class B extends A {
            int k;
            void showk()     {     System.out.println("\nk: " + k);  }
            void sum()        {     System.out.println("\ni+j+k: " + (i+j+k));  }
}

public class basic_1 {
    public static void main(String[] args) {
        A superOb  = new A();
        B subOb     = new B();
        
        superOb.i = 10;     superOb.j = 20;
        
        System.out.println("Contents of superOb: ");
        superOb.showij();   
        subOb.i = 7;     subOb.j = 8;        subOb.k = 9;
        
        System.out.println("Contents of subOb: ");
        subOb.showij();
        subOb.showk();      
        System.out.println("Sum of i, j and k in subOb:");
        subOb.sum();
    }
}
