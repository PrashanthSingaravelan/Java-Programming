package Byte_Streams;
import java.io.ByteArrayInputStream;

public class byte_array_input_streams  {
    public static void main(String args[]) throws Exception{
         byte b[] = { 'a' , 'b' , 'c' , 'd' , 'e' , 'f' , 'g' , 'h' , 'i' , 'j' , 'k' };
         ByteArrayInputStream bis = new ByteArrayInputStream(b);
         //                                      Method-1
//         int x;
//         while((x=bis.read())!=-1) {
//             System.out.println((char)x);
//          }   
        //                                      Method-2
         String str1 = new String(bis.readAllBytes());
         System.out.println(str1);
         System.out.println(bis.markSupported());
         bis.close();    
    }
}
