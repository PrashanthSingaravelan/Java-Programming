package collections;

import java.util.LinkedList;

public class linked_list {
    public static void main(String[] args) {
        LinkedList<String> linked_list_str  = new LinkedList<String>();
        
        // adding the elements into the linked list
        linked_list_str.add("P");       linked_list_str.add("R");       linked_list_str.add("A");
        System.out.println("Linked List elements : " + linked_list_str);
        
        // adding the elements at the beginning and at the end
        linked_list_str.addFirst("Adding at the first");
        linked_list_str.addLast("Adding at the last");
        System.out.println("Linked List elements : " + linked_list_str);
        
        // removing the elements 
        linked_list_str.removeFirst();
        linked_list_str.removeLast();
        System.out.println("Linked List elements : " + linked_list_str);
        
        String val = linked_list_str.get(2);  
        System.out.println("Value at the index-2" + val);
        System.out.println("Linked List elements : " + linked_list_str);
        
        linked_list_str.clear();
        System.out.println("Linked List elements : " + linked_list_str);
        
    }    
}
