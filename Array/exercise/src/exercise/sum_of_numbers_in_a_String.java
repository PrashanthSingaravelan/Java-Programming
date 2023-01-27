package exercise;

public class sum_of_numbers_in_a_String {
    public static void main(String[] args) {
        int sum1 = 0;
        String str1 = "12abc20yz68";
        
        // traversing a string
        for(int i=0;i<str1.length();i++) {
            char ch = str1.charAt(i);
            if (Character.isDigit(ch)) {  
                sum1+=Integer.parseInt(String.valueOf(ch)); }
            }
        
        System.out.println("The sum is " + sum1);
    }
}
