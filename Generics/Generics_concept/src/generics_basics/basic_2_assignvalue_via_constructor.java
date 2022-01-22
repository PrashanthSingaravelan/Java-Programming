package generics_basics;
class Gen<T> {
          T obj1;   // declare a object of class T
          Gen (T obj_main) {    this.obj1 = obj_main;      }
          
           // return an object to the main
          T getobj()               {    return this.obj1;   }
          
          void showtype()   { System.out.println("Type of the generic class is : " + obj1.getClass().getName());       }
}

public class basic_2_assignvalue_via_constructor {
    public static void main(String[] args) {
        
        // creating objects for integer
            Gen<Integer>obj_integer = new Gen<Integer>(88);
            obj_integer.showtype();
            int n = obj_integer.getobj();
            System.out.println("value : " + n);
            
        // creating objects for string
            Gen<String>obj_string = new Gen<String>("Test message");
            obj_string.showtype();
            String m = obj_string.getobj();
            System.out.println("value : " + m);
    }
}
