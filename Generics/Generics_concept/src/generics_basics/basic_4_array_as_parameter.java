package generics_basics;

class Array_param <T> {
    T generic_arr[] = (T[]) new Object[10];
    int length=0;
    
    Array_param ( T item_from_main[] ){
        for(T element:item_from_main) {     this.generic_arr[length++] = element;      }
        for ( T element : generic_arr )    {     System.out.println(element);    }
     }
}

public class basic_4_array_as_parameter {
    public static void main(String args[]) {
          Integer arr1[] = {1,2,3,4,5};
          Array_param<Integer>obj1 = new Array_param(arr1);
    }
}
