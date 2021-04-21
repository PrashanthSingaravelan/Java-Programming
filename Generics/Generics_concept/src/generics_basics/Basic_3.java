package generics_basics;
@SuppressWarnings("unchecked")
        
class Gen<T> {
        T arr1[] = (T[]) new Object[10];
        int length;
        
        void append(T item_from_main)  {     arr1[length++] = item_from_main;    }
        
        void display() {
            for(int i=0;i<length;i++)                {     System.out.println(arr1[i]);     }
          }     
}

public class Basic_3 {
       public static void main(String args[]) {
           Gen<String> obj_main = new Gen<String>();
           obj_main.append("Prashanth");
           obj_main.append("Sanju Samson"); 
           obj_main.append("ABD");
           
           obj_main.display();
    }
}
