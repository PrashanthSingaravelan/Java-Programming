package linked_list;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Iterator;

public class traversing_linkedlst {
    public static void main(String[] args) {
        LinkedList<String> list1 = new LinkedList<String>(Arrays.asList("Prashanth", "Kumar"));
        
        System.out.println("Forward");
        Iterator ascen_iter_obj = list1.iterator();
        while(ascen_iter_obj.hasNext()) 
            System.out.print(ascen_iter_obj.next() + " ");
        
        System.out.println("\nReverse");
        Iterator des_iter_obj = list1.descendingIterator();
        while(des_iter_obj.hasNext()) 
            System.out.print(des_iter_obj.next() + " ");
        
        
         System.out.println("\nForward");
        list1.forEach(element -> {
           System.out.print(element + " "); 
        });
        
        String last_element = list1.pollFirst();
        System.out.println("\nLast element : " + last_element);
        
        System.out.println("Remove : " + list1.removeIf(str->str.contains("Vijay")));   
        
    }
}
