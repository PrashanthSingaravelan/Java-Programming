package Byte_Streams;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;

public class byte_array_output_streams  {
    public static void main(String args[]) throws Exception{
         ByteArrayOutputStream bos = new ByteArrayOutputStream(20);
         
         bos.write('a');    bos.write('b');     bos.write('c');     bos.write('d');
        
         bos.writeTo(new FileOutputStream("F:/github/Java-Programming/" +
                 "Streams/Streams_concept/src/Byte_Streams/sample.txt"));
         bos.close();
    }
}