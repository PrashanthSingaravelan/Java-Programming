package Character_Streams;

import java.io.CharArrayWriter;
import java.io.CharArrayReader;

import java.io.FileWriter;
import java.io.File;

public class character_array_output_streams {
    public static void main(String args[]) throws Exception {
        String newLine = System.getProperty("line.separator");
        try(FileWriter fw = new FileWriter(new File(("F:/github/Java-Programming/" +
                 "Streams/Streams_concept/src/Character_Streams/sample.txt")));
         CharArrayWriter cw = new CharArrayWriter()) {
         
         cw.write("Prashanth");    cw.write(newLine);
         cw.write("David");           cw.write(newLine);
         cw.write("Cummins");     cw.write(newLine); 
         cw.write("Nattu");            cw.write(newLine);
         cw.writeTo(fw);
         cw.close();
        }
    }
}
