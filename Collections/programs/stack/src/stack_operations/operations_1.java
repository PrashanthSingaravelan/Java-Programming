package stack_operations;

import java.util.Stack;

public class operations_1 {
    public static void main(String[] args) {
        Stack<Integer> st1 = new Stack<Integer>();
        
        st1.push(10); st1.push(11); st1.push(12); st1.push(13); st1.push(14);
        int index = st1.search(12);
        System.out.println("element-12 occurs at the index : " + index);
    }
}
