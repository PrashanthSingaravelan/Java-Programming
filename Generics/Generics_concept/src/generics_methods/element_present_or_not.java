package generics_methods;

public class element_present_or_not {
    // searches whether the element is there in the array/not
    static<T,V extends T> boolean Is_In(T element, V []arr1) { 
           for (int i=0;i<arr1.length;i++) {
               if(element.equals(arr1[i])) {    return true;    }
           }
           return false;   
    } 
    
    public static void main(String args[]) {
          Integer nums[] = { 10,20,30,40,50 };
          if(Is_In(50, nums)) { System.out.println("50 is in nums") ; }
          System.out.print("30 is in nums array : ");      System.out.print(Is_In(30,nums));
          System.out.print("\n5 is in nums array : ");     System.out.print(Is_In(5,nums));
          System.out.print("\n19 is in nums array : ");   System.out.println(Is_In(19,nums));
          
          String strs[] = { "one" , "two" , "three" , "four" , "five" };
          if(Is_In("five", strs)) { System.out.println("five is in in nums") ; }
          System.out.print("two is in strs array : ");           System.out.print(Is_In("two",strs));
          System.out.print("\nseven is in strs array : ");    System.out.print(Is_In("seven",strs));
          
          System.out.print("\nfive is in nums array : ");    System.out.println(Is_In("five",nums));
          if(Is_In("two", nums)) { System.out.println("two is in strs") ; }
    }
}