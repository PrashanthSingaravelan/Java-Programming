package stack_operations;

import java.util.Stack;

public class basic_creations {
    public static void main(String[] args) {
        Stack<Integer> st1 = new Stack<Integer>();
        
        st1.push(10); st1.push(11); st1.push(12); st1.push(13); st1.push(14);
        
        System.out.println("Before removal     : " + st1);
        System.out.println("Popped out element : " + st1.pop());
        System.out.println("After removal      : " + st1);
        
        System.out.println(st1.add(15)); // returns boolean
        System.out.println(st1.push(20)); // returns the object it-self (i.e elements)
        
        
    }
}
