package generics_methods;

class Myarray<T> {
         T arr1[] = (T[]) new Object[10];
         int length=0;
         public void append(T item_main) {  arr1[length++] = item_main;        }
         
         public void display() {
             for(int i=0;i<length;i++) {
                 System.out.println(arr1[i]);
             }
         }
}

public class generic_for_arguments {
    //static void fun(Myarray obj) {  accepting the argument as object type
        static void fun(Myarray<? extends Number > obj1) {  // accepting the argument of any type
            obj1.display();
    }
    public static void main(String[] args) {
          Myarray<String> obj1 = new Myarray<>();
          obj1.append("Hello");
          obj1.append("Hi");
        
          Myarray<Integer> obj2 = new Myarray<>();
          obj2.append(10);
          obj2.append(20);
          
          fun(obj1);
          fun(obj2);
    }
}
