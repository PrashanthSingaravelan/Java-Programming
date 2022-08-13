package Character_Streams;

import java.io.FileReader;

public class file_writer_stream {
    public static void main(String args[]) {
        try(FileReader fr = new FileReader("sample.txt")) {
            int x;
            while((x=fr.read())!=-1) {
                System.out.print((char)(x));
            }
            
        } catch(Exception e) {}
    }
}
