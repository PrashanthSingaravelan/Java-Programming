package Piped_Streams;

import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.IOException;

public class Piped_Input_Streams {
    public static void main(String args[]) throws IOException{
         PipedInputStream pis     = new PipedInputStream();
         PipedOutputStream pos = new PipedOutputStream();
         
         pis.connect(pos);  // connecting the input and output streams
         
         // Writing and Reading the character one-by-one
         pos.write(77);    System.out.println("Using read() : " + (char)pis.read());
         pos.write(80);    System.out.println("Using read() : " + (char)pis.read());
         pos.write(79);    System.out.println("Using read() : " + (char)pis.read());
         
         // Wrting and Reading the characters together
         pos.write(70);     pos.write(71);      pos.write(72);      pos.write(73);      pos.write(74); 
         
         System.out.println("Available contents : " + pis.available());
         
         byte buffer [] = new byte[5];
         pis.read(buffer,0,5);                      // pis.read(buffer , offset , maxlen)
         String str = new String(buffer);   // converting the buffer to string
         
         System.out.println("String read : " + str);
         
    }
}

