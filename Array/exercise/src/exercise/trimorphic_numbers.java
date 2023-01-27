package exercise;

public class trimorphic_numbers {
    public static void main(String[] args) {
        int num1     = 4;
        int cube_ans = num1*num1*num1; // 4*4*4 -> 64
        
        int quotient  = cube_ans / 10;
        int remainder = cube_ans % 10;
        
        if (remainder == num1) { System.out.println(num1 + " is a Trimorphic number"); }
        else { System.out.println(num1 + " is not a Trimorphic number"); }
        
    }
}
