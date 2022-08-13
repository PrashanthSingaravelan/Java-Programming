package Buffered_Streams;
    
import java.io.FileInputStream;
import java.io.BufferedInputStream;

public class markSupported_feature {
    public static void main(String args[]) throws Exception{
         FileInputStream fis = new FileInputStream("sample.txt");
         BufferedInputStream bis = new BufferedInputStream(fis);
         
         System.out.println("Mark Supported Feature FileInputStream : " + fis.markSupported());
         System.out.println("Mark Supported Feature BufferedInputStream : " + bis.markSupported());
    }
}

