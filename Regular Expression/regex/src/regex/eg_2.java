package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class eg_2 {
    public static void main(String[] args) {
        String source_str1 = "prashanth";
        
        Pattern pattern = Pattern.compile("t.");
        Matcher matcher    = pattern.matcher(source_str1);
        System.out.println("matcher.find() : " + matcher.find());    // sub-string matching
        
        System.out.println(Pattern.compile(".t").matcher(source_str1).matches());
        
        System.out.println(Pattern.matches("t.", "to"));
    }
}
