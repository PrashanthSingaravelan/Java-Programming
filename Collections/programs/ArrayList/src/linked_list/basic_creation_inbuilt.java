package linked_list;

import java.util.Scanner;
import java.util.LinkedList;

public class basic_creation_inbuilt {
    public static void main(String[] args) {
        Scanner scn_obj          = new Scanner(System.in);
        LinkedList<String> list1 = new LinkedList<String>();
        
        System.out.println("Enter linked-list elements : ");
        int i=0;
        int n=5;
        
        while(i<n) { list1.add(scn_obj.next()); i++; }
        
        System.out.println(list1);
    }
}
