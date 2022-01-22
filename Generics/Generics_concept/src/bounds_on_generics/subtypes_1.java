package bounds_on_generics;
        
class Array1<T> {
          T arr1[] = (T[]) new Object[10];
          int length = 0;
          void append(T item_from_main)                 {  arr1[length++] = item_from_main;    }
          void display1()       {
              for(int i=0;i<length;i++)     {  System.out.print(arr1[i] + " ");        }
          }
}

class Array2<T> extends Array1<T> {    // a generic class can inherit from a generic class only
        void display2()        {                       // a generic class cannot inherit from a normal class
            for(int i=0;i<length;i++)     {  System.out.print(arr1[i]+ " ");        }
          }
}

public class subtypes_1 {
    public static void main(String args[]) {
          Array1 obj = new Array1();    // generic objects --> I can insert any values
          obj.append("Hello");
          obj.append(10);
          obj.append(98.75);          
          System.out.println("Class-1 ");   obj.display1();
          
          System.out.println("\n");
        
          Array2 obj1 = new Array2 ();
          obj1.append("Hello");
          obj1.append(10);
          obj1.append(98.75);
          
          System.out.println("Class-1 ");    obj1.display1();
          System.out.println("\n");
          System.out.println("Class-2 ");    obj1.display2();
    }
}

