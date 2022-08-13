package streams_concept;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.File;

public class challenge_cpy_file_lower {
    public static void main(String args[]) throws IOException{
        int i;
       FileInputStream fin;
       FileOutputStream fout;
        
          try{
                try {
                   fin   = new FileInputStream("F:/github/Java-Programming/Streams/Streams_concept/src/streams_concept/sample_1.txt"); 
                } catch(FileNotFoundException e) { System.out.println("Sample_1 file not found"); return;}

                try {
                   fout = new FileOutputStream("F:/github/Java-Programming/Streams/Streams_concept/src/streams_concept/sample_2.txt"); 
                }  catch(FileNotFoundException e) { System.out.println("Sample_2 file not found"); return;}
                 
          } catch(ArrayIndexOutOfBoundsException e)  {    System.out.println("File Error");  return;  }
       
        try{
                while((i=fin.read())!=-1) {
                   if (i>=65 && i<=90) { fout.write(i+32); }
                   else { fout.write(i); }
               } 
            
            fin.close();
            fout.close();
            
          } catch(IOException e) {}
       }
}
