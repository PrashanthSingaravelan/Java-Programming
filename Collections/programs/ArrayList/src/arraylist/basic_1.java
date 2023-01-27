package arraylist;

import java.util.ArrayList;
import java.util.List;

public class basic_1 {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>(20);
        ArrayList<Integer> l2 = new ArrayList<>(List.of(11,12,13,14,15));
        
        l1.add(10); l1.add(15); l1.add(20); l1.add(25); l1.add(30);  l1.add(15);
        System.out.println("Array List elements : " + l1);
        
        l1.add(3, 100);
        System.out.println("Array List elements after inserting : " + l1);
        
        System.out.println("Replacing the 0th index element as 11 : " + l1.set(0,11)); 
        
        System.out.println("What is the element present at index-3 : " + l1.get(3));
        System.out.println("Element-15's index : " + l1.indexOf(15));
        System.out.println("Element-15's index : " + l1.lastIndexOf(15));
        
        System.out.println("Is 25 present??     : " + l1.contains(25));
        System.out.println("Is list-2 present?? : " + l1.containsAll(l2));
    }    
}
