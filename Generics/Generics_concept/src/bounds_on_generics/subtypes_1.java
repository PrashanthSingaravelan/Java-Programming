package bounds_on_generics;
        
class MyArray1<T> {
          T arr1[] = (T[]) new Object[10];
          int length = 0;
          void append(T v)                 {  arr1[length++] = v;    }
          void display1()       {
              for(int i=0;i<length;i++)     {  System.out.print(arr1[i] + " ");        }
          }
}

class MyArray2<T> extends MyArray1<T> {  // a generic can inherit from a generic class only
        void display2()        {
            for(int i=0;i<length;i++)     {  System.out.print(arr1[i]+ " ");        }
          }
}

public class subtypes_1 {
    public static void main(String args[]) {
          MyArray1 obj = new MyArray1();
          obj.append("Hello");
          obj.append(10);
          obj.append(98.75);          
          System.out.println("Class-1 ");   obj.display1();
          
          System.out.println("\n");
        
          MyArray2 obj1 = new MyArray2 ();
          obj1.append("Hello");
          obj1.append(10);
          obj1.append(98.75);
          
          System.out.println("Class-1 ");    obj1.display1();
          System.out.println("\n");
          System.out.println("Class-2 ");    obj1.display2();
    }
}

