package random_file_access;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.io.IOException;

public class basic_2 {
    public static void main(String args[]) throws Exception{
         RandomAccessFile rf = new RandomAccessFile("sample_2.txt","rw");
         
         String data_1 = "This is cool";    
         String data_2 = "Awesome its a brilliant work";
         
         rf.writeChars(data_1);
         rf.writeUTF(data_2); 
         rf.seek(0); 
         
         // reading from data-1 and data-2
         try {
         System.out.print("Data-1 : ");
         for(int i=0;i<data_1.length();i++)     {  System.out.print((char)rf.readChar());   }   // each charaters takes 2 bytes
         } catch(Exception e) {    System.out.println(e);  }
         
         try{  System.out.print("\nData-2 : " + rf.readUTF());  }     catch(Exception e) {}
         
         // challenge --> skip the data-1 and read only data-2
         rf.seek(0);   // now reached the beginning
         rf.seek(data_1.length()*2);  // moving to the data-2's position  (each character --> 2 bytes)
         try{  System.out.println("\n\nChallenge --> Data-2 : " + rf.readUTF());  }     catch(Exception e) {}
         
         rf.close();
    }
}
