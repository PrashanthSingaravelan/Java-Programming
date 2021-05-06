package Buffered_Streams;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class input_streams {
    public static void main(String args[]) throws Exception {
         FileInputStream fis = new FileInputStream("F:/github/Java-Programming/" +
                 "Streams/Streams_concept/src/Buffered_Streams/sample.txt");
         BufferedInputStream bis = new BufferedInputStream(fis);
         
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
    }
}
