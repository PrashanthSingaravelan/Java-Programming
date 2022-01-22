package collections.array_list;

import java.util.ArrayList;
import java.util.Collections;

public class reverse_shuffle {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("Prashanth");
        list1.add("Mac Book Air");
        list1.add("Sabarinathan");
        list1.add("Mothish");
        list1.add("Mac Book pro");
        System.out.println("List-1 elements : " + list1);
        
        Collections.reverse(list1);
        System.out.println("After reversing the list : " + list1);
        
        Collections.shuffle(list1);
        System.out.println("After shuffling the list : " + list1);
    }
}





 