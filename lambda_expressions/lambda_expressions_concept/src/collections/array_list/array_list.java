package collections.array_list;

import java.util.ArrayList;

public class array_list {
    public static void main(String[] args) {
            ArrayList<String> list_str = new ArrayList<String>();
            System.out.println("Intial size of Array List : " + list_str.size());
            list_str.add("P");      list_str.add("R");      list_str.add("A");   
            list_str.add("S");      list_str.add("H");      list_str.add("A"); 
            list_str.add("N");      list_str.add("T");      list_str.add("H"); 
            System.out.println("Size of string list : " + list_str.size());
            
            System.out.println("The string elements are : " + list_str);
            
            // adding the elements at a particular index
            list_str.add(4,"String is added at index-4");
            System.out.println("Inserting the element at index-4 : " + list_str);
            
            // removing the element at a particular index
            list_str.remove(9);
            System.out.println("Removing the element at index-9 : " + list_str);
            
            // removing the element directly
            list_str.remove("String is added at index-4");
            System.out.println("Removing the element at index-4 : " + list_str);
            
            // contents of the string list
            System.out.println("The string elements are : " + list_str);
    }    
}
