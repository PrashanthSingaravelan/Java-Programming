package exercise;

public class two_strings_are_equal {
    public static void main(String[] args) {
        String word1[] = new String[]{"ab", "c"};
        String word2[] = new String[]{"a", "bc"};
        
        String combine_word1 = new String();
        String combine_word2 = new String();
        
        for(String i:word1) { combine_word1 += i; }
        for(String i:word2) { combine_word2 += i; }
        
        System.out.println(combine_word1);
        System.out.println(combine_word2);
        
        if (combine_word1.equals(combine_word2))
            System.out.println(true);
        else
            System.out.println(false);
    }
}
