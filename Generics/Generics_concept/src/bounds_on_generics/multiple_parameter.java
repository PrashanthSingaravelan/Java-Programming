package bounds_on_generics;

 class TwoGen<T,V> {
          T obj1;
          V obj2;
              
          TwoGen(T obj1_from_main, V obj2_from_main) {
                  this.obj1 = obj1_from_main;
                  this.obj2 = obj2_from_main;
          }
          
          void showTypes(){
                  System.out.println("Type of T is " + this.obj1.getClass().getName());
                  System.out.println("Type of V is " + this.obj2.getClass().getName());
          }
              T getobj1()  { return this.obj1; }
              V getobj2()  { return this.obj2; }
      }

public class multiple_parameter {
    public static void main(String args[]) {
          TwoGen<Integer,String> obj1_main = new TwoGen<Integer,String>(24,"Prashanth");
          obj1_main.showTypes();
          System.out.println("Integer : " + obj1_main.getobj1());
          System.out.println("String : " + obj1_main.getobj2());
    }
}


