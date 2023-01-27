package arraylist;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class two_lists {
    public static void main(String[] args)   {
        
        List<String> list1 = new ArrayList<String>(Arrays.asList("hello", "hi", "bye"));
        List<String> list2 = new ArrayList<String>(Arrays.asList("hello", "hi", "bye", "loo"));
        
        System.out.println(list2.containsAll(list1));
        System.out.println(list1.containsAll(list2));
        
        System.out.println(list1.contains(list2)); // since loo is not present list1
        
        try {
            System.out.println("From index-2 to index-4 : " + list2.subList(2, 4));
            System.out.println("From index-2 to index-5 : " + list2.subList(2, 5));
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
