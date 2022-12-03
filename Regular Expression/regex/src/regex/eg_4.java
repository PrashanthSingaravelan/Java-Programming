package regex;

import java.util.regex.Pattern;

public class eg_4 {
    public static void main(String[] args) {
        System.out.println(Pattern.matches("\\d", "9"));   // only 1 digit -> match
        System.out.println(Pattern.matches("\\d", "91"));  // only 1 digit -> no match
        
        System.out.println(Pattern.matches("\\d*", "91")); // >1 digits -> match
        
        System.out.println(Pattern.matches("\\D*", "prashanth")); // >1 non-digits -> match
        
        // Matching our mobile number
        System.out.println(Pattern.matches("[9]{1}[0-9]{9}", "9003075249")); 
        System.out.println(Pattern.matches("[9]{1}\\d{9}",   "9003075249")); 
    }
}
