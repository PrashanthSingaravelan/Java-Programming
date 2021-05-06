package Buffered_Streams;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;

public class reader {
    public static void main(String args[]) throws Exception {
         FileReader fis = new FileReader("F:/github/Java-Programming/" +
                 "Streams/Streams_concept/src/Buffered_Streams/sample.txt");
         BufferedReader bis = new BufferedReader(fis);
         
         System.out.print((char)bis.read());
         System.out.print((char)bis.read());
         System.out.print((char)bis.read());
         System.out.print((char)bis.read());
         System.out.print((char)bis.read());
         bis.mark(10);
         System.out.print((char)bis.read());
         System.out.print((char)bis.read());
         bis.reset();
         System.out.print((char)bis.read());
         System.out.print((char)bis.read());
         
         System.out.println("\nReading the remaining words : " + bis.readLine());
    }
}
