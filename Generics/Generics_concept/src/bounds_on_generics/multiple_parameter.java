package bounds_on_generics;

 class TwoGen<T,V> {
          T obj1;   // parameter-1
          V obj2;   // parameter-2
         
          // Constructor 
          TwoGen(T obj1_from_main, V obj2_from_main)     {
                  this.obj1 = obj1_from_main;
                  this.obj2 = obj2_from_main;
          }
          
          void showTypes()      {
                  System.out.println("Type of T is " + this.obj1.getClass().getName());
                  System.out.println("Type of V is " + this.obj2.getClass().getName());
          }
          
              T getobj1()  { return this.obj1; }
              V getobj2()  { return this.obj2; }
      }

public class multiple_parameter {
    public static void main(String args[]) {
         //TwoGen<Integer,String> int_str   = new TwoGen<>(24,"Prashanth");
          TwoGen<Integer,String> int_str     = new TwoGen<Integer,String>(24,"Prashanth");          
          int_str.showTypes();
          System.out.println("Integer : " + int_str.getobj1());
          System.out.println("String   : " + int_str.getobj2());
    }
}


