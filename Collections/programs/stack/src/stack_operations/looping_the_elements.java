package stack_operations;

import java.util.Stack;
import java.util.Iterator;

public class looping_the_elements {
    public static void main(String[] args) {
        Stack<Integer> st1 = new Stack<Integer>();
        st1.push(10); st1.push(11); st1.push(12); st1.push(13); st1.push(14);
        
        System.out.println("Using iterator");
        Iterator iterator = st1.iterator();
        while(iterator.hasNext()) {
            Object elements = iterator.next();
            System.out.print(elements + " ");
        }
        
        System.out.println("\nUsing for-Each method");
        st1.forEach(element -> {
                System.out.print(element + " ");
            }
        );
    }
}
