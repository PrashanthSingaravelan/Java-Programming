package string_buffer;

public class basic_1 {
    public static void main(String[] args) {
            StringBuffer sb = new StringBuffer("Hello");
            System.out.println("Buffer : " + sb);
            System.out.println("Buffer length    : " + sb.length());
            System.out.println("Buffer capacity : " + sb.capacity());
            
            System.out.println("Character at 1st index : " + sb.charAt(1));
            sb.setCharAt(1,'p');   // setting character 'p' at index-1
            System.out.println("Buffer : " + sb);
            
            // increasing the length to 2
            sb.setLength(2);
            System.out.println("Buffer after setting the length-2 : " + sb);
            System.out.println("Character at 1st index : " + sb.charAt(1));
            
            StringBuffer sb1 = new StringBuffer("Hello This is Kumar");
            sb1.insert(2,"Prashanth");
            System.out.println("Buffer after adding the element at index-2 : " + sb1);
    }
}
