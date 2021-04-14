package streams_concept;
import java.io.*;

public class file_example_output_streams {
    public static void main(String args[]) throws Exception { 
        
                                             /*            Method-3   (write-offset        */
                try (FileOutputStream fos = new FileOutputStream("F:/github/Java-Programming"
                                                        + "/Streams/Files via JAVA/sample.txt")) {
                String str1 = "Hello this is Prashanth from Vegan";
                byte b[] = str1.getBytes();
                fos.write(b,6,str1.length()-6); 
          }  
                                                    
                                                                /*                               Method-1      
        try {
                FileOutputStream fos = new FileOutputStream("F:/github/Java-Programming"
                        + "/Streams/Files via JAVA/sample.txt");              
        
                String str1 = "Hello this is Prashanth from Vegan";
                
                 //  getBytes() --> return bytes
                 //  str1.getBytes() --> str1 is converted into array of bytes 
                 //  fos.write(str1.getBytes()) --> the above converted is written into the file                   

                fos.write(str1.getBytes());                   
                fos.close();  // closing the file   */
                                                                                                                
                                                                /*                              Method-2          
                     try {
                FileOutputStream fos = new FileOutputStream("F:/github/Java-Programming"
                        + "/Streams/Files via JAVA/sample.txt");              
                                                                
                String str1 = "Hello this is Prashanth from Vegan";
                byte b[] = str1.getBytes();         // converting the string into array of bytes
                
                for(byte x:b)      // iterating over the array of bytes and printing one-by-one
                    fos.write(x);
                
                fos.close();   */
    }
}