package bounds_on_generics;

class A{}   // Number class
class B extends A{}   // integer class inheriting from number class
class C extends A{}   // double class inheriting from number class

class MyArray1<T extends A> {   
        
}

public class bounded_types_inheritance {
    public static void main(String args[]) {
          MyArray1<C> obj1 = new MyArray1<>();   // C --> double
    }
}