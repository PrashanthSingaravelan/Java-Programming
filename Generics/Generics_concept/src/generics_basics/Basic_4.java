package generics_basics;

class Gen <T> {
     Gen ( T item_from_main[] ){
         for ( T element : item_from_main ) {   System.out.printf("%s ", element);    }
     }
}

public class Basic_4 {
    public static void main(String args[]) {
           //Gen<Integer> obj1[] = new Gen(   {1,2,3,4,5} ) ; 
           Gen<Integer>obj1 = new Gen([1,2,3,4,5]);
    }
}
