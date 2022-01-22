package Character_Streams;

import java.io.CharArrayReader;

public class character_array_input_streams  {
    public static void main(String args[]) throws Exception {
         char c[] = { 'a' , 'b' , 'c' , 'd' , 'e' , 'f' , 'g' , 'h' , 'i' , 'j' , 'k' };
         CharArrayReader cr_1 = new CharArrayReader(c);
         int x;
         while ((x=cr_1.read())!=-1) { System.out.println((char)x);    }
         cr_1.close();

         char[] arr1 = "Happy evening, thank you see you again".toCharArray();
         CharArrayReader cr_2 = new CharArrayReader(arr1);
         int y;
         while ((y=cr_2.read())!=-1)        {    System.out.printf("%c" , (char) y);     }
         cr_2.close();
    }
}