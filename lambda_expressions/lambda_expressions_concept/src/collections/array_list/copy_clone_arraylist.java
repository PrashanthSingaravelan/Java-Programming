package collections.array_list;

import java.util.ArrayList;

public class copy_clone_arraylist {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("Prashanth");
        list1.add("Sabarinathan");
        list1.add("Mothish");
        System.out.println("List-1 elements : " + list1);
        
        ArrayList<String> list2 = new ArrayList<String>();
        list2.add("Hello");
        list2.add("I am ");
        list2.add("Good");
        System.out.println("List-2 elements : " + list2);
        
        list1.addAll(list2);
        System.out.println("After adding list2 to list1 : " + list1);
        
        list1.clear();
        System.out.println("After clearing the list1 : " + list1);
    }
}



