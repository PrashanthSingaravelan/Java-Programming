package bounds_on_generics;
        
class array1<T> {
          T arr1[] = (T[]) new Object[10];
          int length = 0;
          void append(T v)                 {  arr1[length++] = v;    }
          
          void display1()       {
              for(int i=0;i<length;i++)     {  System.out.println(arr1[i]);        }
          }
}

class array2<T> extends array1<T> {     // a generic can inherit from a generic class only
        void display2()        {
            for(int i=0;i<length;i++)     {  System.out.println(arr1[i]);        }
          }
}

public class subtypes_3         {
    public static void main(String args[])      {
          array1<Integer> obj1 = new <Integer>array1();
          array2<String> obj2  = new <String> array2();  // generic class of String type
           
          obj2.append("Hello");
          obj2.append("Prashanth");
          obj2.append("Chennai");
          System.out.println("Class-2 ");   obj2.display2();
          
          obj1.append(10);
          obj1.append(20);
          obj1.append(30);
           System.out.println("Class-1 ");   obj1.display1();
    }
}

