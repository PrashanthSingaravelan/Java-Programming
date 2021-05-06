package streams_concept;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class challenge_copy_file {
public static void main(String args[]) throws IOException
            {
            int i;
            FileInputStream fin;
            FileOutputStream fout;
            try {
                    try {
                    fin = new FileInputStream("F:/github/Java-Programming/Streams/Streams_concept/src/streams_concept/sample_1.txt");  }
                    catch(FileNotFoundException e) {   System.out.println("Input File Not Found");        return;     }
            try {
                    fout = new FileOutputStream("F:/github/Java-Programming/Streams/Streams_concept/src/streams_concept/sample_2.txt");    } 
                    catch(FileNotFoundException e) {     System.out.println("Error Opening Output File");      return;        }
                } 
            catch(ArrayIndexOutOfBoundsException e) {     System.out.println("Usage: CopyFile From To");        return;   }
            try {
                    do {
                    i = fin.read();    // reading from the file
                    if(i != -1) fout.write(i);  // writing onto the file
                    } while(i != -1);
            } catch(IOException e)          {    System.out.println("File Error");   }
                    fin.close();
                    fout.close();
            }
}
