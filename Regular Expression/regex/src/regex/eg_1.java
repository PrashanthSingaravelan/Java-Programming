package regex;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class eg_1 {
    public static void main(String[] args) {
        
        Pattern pattern = Pattern.compile("shanth");
        
        String source_str1 = "prashanth";
        Matcher matcher    = pattern.matcher(source_str1);

        System.out.println("matcher.matches() : " + matcher.matches()); // whole string matching
        System.out.println("matcher.find()    : " + matcher.find());    // sub-string matching
    }
}
