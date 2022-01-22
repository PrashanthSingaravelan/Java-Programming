package generics_methods;

public class method_2 {
         // static <E> void show(E[] list)
         static <E extends Number> void show(E... list)  {      // show is a generic method
               for(E item:list)  {   System.out.print(item);            }
}

public static void main(String[] args) {
         show(new String[]  {"Hi    " , "Go    " , "Bye    "} );
         System.out.println();     show(new Integer[] {10 , 20 , 30} );
         System.out.println();     show(12.4 , 15.6 , 90.5 , 19,3);
    }
}
