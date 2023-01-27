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
        
        System.out.println("Reverse");
        Iterator des_iter_obj = list1.descendingIterator();
        while(des_iter_obj.hasNext()) 
            System.out.print(des_iter_obj.next() + " ");
        
        String last_element = list1.pollFirst();
        System.out.println(last_element);
    }
}
