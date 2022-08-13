package collections.array_list;

import java.util.ArrayList;
import java.util.Collections;

public class swap_two_elements {
    public static void main(String[] args) {
            ArrayList<String> list1 = new ArrayList<String>();
            list1.add("First");         list1.add("Second");     list1.add("Third");
            list1.add("Fourth");     list1.add("Fifth");           list1.add("Sixth");
            
            System.out.println("Before swapping the List-1 : "+list1);
            Collections.swap(list1, 2, 3);
            System.out.println("After swapping the List-1 : "+list1);
    }
}
