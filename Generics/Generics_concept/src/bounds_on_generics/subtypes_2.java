package bounds_on_generics;
        
class MyArray1<T> {
          T arr1[] = (T[]) new Object[10];
          int length = 0;
          void append(T v)                 {  arr1[length++] = v;    }
          void display1()       {
              for(int i=0;i<length;i++)     {  System.out.println(arr1[i]);        }
          }
}

class MyArray2 extends MyArray1<String> {  // a generic can inherit from a generic class only
        void display2()        {
            for(int i=0;i<length;i++)     {  System.out.println(arr1[i]);        }
          }
}

public class subtypes_2 {
    public static void main(String args[]) {
          MyArray1 obj = new MyArray1();
          obj.append("Hello");
          obj.append(10);
          obj.append(98.75);
          System.out.println("Class-1 ");   obj.display1();
        
          MyArray2 obj1 = new MyArray2 ();
          obj1.append("Hello");
          obj1.append(10);
          obj1.append(98.75);
          
          System.out.println("Class-1 ");    obj1.display1();
          System.out.println("Class-2 ");    obj1.display2();
    }
}

