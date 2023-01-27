package exercise;

public class substring_in_a_string {
    public static void main(String[] args) {
        int max_len = 0;
        String str1 = "prashanth";
        String str2 = "sha";
        
        int str1_length = str1.length();
        int str2_length = str2.length();
        
        int match_len = str2_length;
        
        String ans = " ";
        int str2_index = 0;
        
        if(str1.length() > str2.length())  {  max_len = str1.length(); }
        else                               {  max_len = str2.length(); }
        
        for(int i=0;i<max_len;i++) {
            if (str1.charAt(i) == (str2.charAt(str2_index++))) {
                match_len +=1;
                
                if (match_len == str2_length) { break;  }
            }
            
            else {
            // reverting the 2nd string procedure
                match_len  = 0;
                str2_index = 0;

                if (str1.charAt(i) == (str2.charAt(str2_index++))) {
                    match_len +=1;
                }
            }
        }
        
        if (match_len == str2_length) { System.out.println("Match is found"); }
        else                          { System.out.println("Match is not found"); }
        
  }
}
