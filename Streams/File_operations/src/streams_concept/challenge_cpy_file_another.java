package streams_concept;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;

public class challenge_cpy_file_another {
    public static void main(String args[]) throws Exception {
        
       FileInputStream fin_1 = new FileInputStream("F:/github/Java-Programming/Streams/Streams_concept/src/streams_concept/sample_1.txt");
       FileInputStream fin_2 = new FileInputStream("F:/github/Java-Programming/Streams/Streams_concept/src/streams_concept/sample_2.txt");
       FileOutputStream fout = new FileOutputStream("F:/github/Java-Programming/Streams/Streams_concept/src/streams_concept/sample_3.txt");
       SequenceInputStream sin = new SequenceInputStream(fin_1,fin_2);        
    
        int i;
        while((i=sin.read())!=-1) {
            fout.write(i);
        }
        fin_1.close();
        fin_2.close();
        fout.close();
    }
}
