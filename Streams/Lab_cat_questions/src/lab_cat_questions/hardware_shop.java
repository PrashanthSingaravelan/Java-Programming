package lab_cat_questions;
import java.io.*;

public class hardware_shop {
    public static void main(String[] args) {
          try (FileInputStream fis = new FileInputStream("F:/github/Java-Programming"
                                                        + "/Streams/Files via JAVA/hardware.txt")) {
             
           int x;
           while((x = fis.read())!=-1) {
                    System.out.print((char)x);
                    }
          }  
          catch (Exception e) {}
    }
}
