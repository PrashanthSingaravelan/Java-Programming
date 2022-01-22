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
          MyArray1 obj1 = new MyArray1();  // generic objects --> I can insert any values
          obj1.append("Hello");
          obj1.append(10);
          obj1.append(98.75);
          System.out.println("Class-1 ");   obj1.display1();
        
          MyArray2 obj2 = new MyArray2 ();  // string objects --> I can insert any string values
          obj2.append("Hello");
          //obj2.append(10);
          //obj2.append(98.75);
          
          System.out.println("Class-1 ");    obj1.display1();
          System.out.println("Class-2 ");    obj2.display2();
    }
}

