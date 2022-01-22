package generics_basics;
@SuppressWarnings("unchecked")
        
class Array<T> {
        T arr1[] = (T[]) new Object[10];
        int length;
        
        void append(T item_from_main)  {     arr1[length++] = item_from_main;    }
        
        void display() {
            for(int i=0;i<length;i++)                {     System.out.println(arr1[i]);     }
          }     
}

public class basic_3_array_operations {
       public static void main(String args[]) {
           Array<String> str_obj = new Array<String>();
           str_obj.append("Prashanth");
           str_obj.append("Sanju Samson"); 
           str_obj.append("ABD");
           
           str_obj.display();
           
           Array<Integer> int_obj = new Array<Integer>();
           int_obj.append(10);
           int_obj.append(20);
           int_obj.append(30);
           
           int_obj.display();
    }
}
