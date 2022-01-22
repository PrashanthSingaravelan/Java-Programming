package collections.array_list;

import java.util.ArrayList;
import java.util.List;

public class sub_list_from_arraylist {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("Prashanth");
        list1.add("Mac Book Air");
        list1.add("Sabarinathan");
        list1.add("Mothish");
        list1.add("Mac Book pro");
        System.out.println("List-1 elements : " + list1);
        
        List<String> list2 = list1.subList(2,4);   // --> (2,3)
        System.out.println("Sub list : " + list2);
        
        System.out.println("Sublist from index-2 to index-4 : " + list2);
    }
}



