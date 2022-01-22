package Piped_Streams;

import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.IOException;

public class Piped_Output_Streams {
    public static void main(String args[]) throws IOException{
         PipedInputStream pis     = new PipedInputStream();
         PipedOutputStream pos = new PipedOutputStream();
         
         pis.connect(pos);  // connecting the input and output streams
         
         byte[] buffer = { 'P' , 'r' , 'a' , 's' , 'h' , 'a' , 'n' , 't' , 'h' };
         pos.write(buffer,0,9);    // pos.write(buffer , offset , maxlen)
         int a = 5;
         while(a>0) {   System.out.print(" " + (char)pis.read());         }
         
         // Wrting and Reading the characters together
         pos.write(70);     pos.write(71);      pos.write(72);      pos.write(73);      pos.write(74); 
         
         pos.flush();
         int i=5;
         while(i>0)     {  System.out.println(" " + (char)pis.read());    i--;      }
    }
}
