package bounds_on_generics;

class A{}
class B extends A{}
class C extends A{}

class MyArray1<T extends A> {    // Number can be byte,short,int,float,double, 
        T arr1[] = (T[]) new Object[10];
        int length=0;
        void append(T item_main) {  arr1[length++]  = item_main;  }
        void display() {
            System.out.println("\nThe array elements are : ");
            for(int i=0;i<length;i++)       {  System.out.print(arr1[i]); }
        }
}

public class bounded_types_1 {
    public static void main(String args[]) {
          MyArray1<A> obj1 = new MyArray1<A>();
          /*
          obj1.append(100f) ;    
          obj1.append(150f);
          obj1.display(); */
    }
}
