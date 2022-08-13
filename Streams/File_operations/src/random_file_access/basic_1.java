package random_file_access;
import java.io.RandomAccessFile;

public class basic_1 {
    public static void main(String args[]) throws Exception {
          RandomAccessFile rf = new RandomAccessFile("sample.txt","rw");
//          contents in the file
//          A    B   C   D   E   F   G   H   I   J
//           0   1    2    3   4    5   6    7   8   9
          System.out.print(rf.getFilePointer());  // 0     System.out.println((char)rf.read());   // A
          System.out.print(rf.getFilePointer());  // 1      System.out.println((char)rf.read());  // B
          
          // Upper case C is over-written with lowercase c
         rf.write('c');                // after writing c the cursor moves to the next position (i.e D)
          
          System.out.println((char)rf.read());  // D
          
          // from the current position the cursor is skipped 3 bytes
          rf.skipBytes(3);          // 4,5,6 are skipped and the cursor stands on H
          System.out.println((char)rf.read());   
          
          rf.seek(3);  // the cursor starts from the 0th index + 3
          System.out.println((char)rf.read());   // D
         
          rf.seek(rf.getFilePointer() + 2);          // D(3rd) + 2 --> 6th index
          System.out.println((char)rf.read());   // G
          
          rf.close();
    }
}
