package Byte_Streams;
import java.io.*;

public class file_input_streams {
    public static void main(String args[]) throws Exception {
                                                               /*           Method-1        
            try (FileInputStream fis = new FileInputStream("F:/github/Java-Programming"
                                                        + "/Streams/Files via JAVA/sample.txt")         ) 
            {
                byte b[] = new byte[fis.available()];   // creating a byte array from the size available in the file
                // size of the byte array should be equal to the contents of the file 
                // fis.available() --> size of the file 
                
                fis.read(b);    // reading the byte array
                String str1 = new String(b);  // converting the byte array into string
                
                System.out.println("Strings from the file");
                System.out.println(str1);
*/  
                                                                 /*           Method-2  
            try (FileInputStream fis = new FileInputStream ("F:/github/Java-Programming"
                                                        + "/Streams/Files via JAVA/sample.txt")         )  
            {
                     int x;
                     do {
                         x = fis.read(); // reading the contents from the file as int
                         System.out.print((char)x);  // converting the int into character [i.e ASCII] and then printing
                     } while(x!=-1);
            }
            */
                                                                    /*           Method-3       */  
          try (FileInputStream fis = new FileInputStream ("F:/github/Java-Programming"
                                                        + "/Streams/Files via JAVA/sample.txt")         )                                                                  
          {
                   int x;
                   while((x = fis.read())!=-1) {    System.out.print((char)x);         } 
          }   
    }
}