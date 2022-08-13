package bounds_on_generics;

class MyArray<T> {
          T arr1[] = (T[]) new Object[10];
          int length = 0;
          void append(T v)                 {  arr1[length++] = v;    }
          void display() {
              for(int i=0;i<length;i++) {  System.out.println(arr1[i]);        }
          }
}

public class no_parameters {
    public static void main(String args[]) {
           MyArray obj1 = new MyArray<>();   // an object of type generic, since parameters are not given
           obj1.append("Hello");  // so the object can support any data-type
           obj1.append(10);
           obj1.append(78.90);
           
           obj1.display();
    }
}
