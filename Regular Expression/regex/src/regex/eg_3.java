package regex;

import java.util.regex.Pattern;

public class eg_3 {
    public static void main(String[] args) {
        String str1 = "Prashanth";
        System.out.println(Pattern.matches("[a-z]*", str1));
        
        System.out.println(Pattern.matches("[A-Z]*[a-z]*", str1)); // 1st caps then only small
        System.out.println(Pattern.matches("[a-z]*[A-Z]*", str1)); // 1st small then only caps
        
        String str2 = "PrashanthSingaravelan";
        
        // all the combinations of small and caps (only letter should start and end)
        System.out.println(Pattern.matches("^[A-Za-z]*$", str2));  
    }
}
