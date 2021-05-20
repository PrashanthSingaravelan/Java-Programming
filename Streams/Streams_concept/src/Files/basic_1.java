package Files;
import java.io.File;

public class basic_1 {
    public static void main(String args[]) {
            File f = new File("F:/github/Java-Programming/Streams/Streams_concept/src");
            System.out.println("Directory name --> : " + f.isDirectory());
            System.out.println("Absolute path -->    : " + f.getAbsolutePath());
            String list1[] = f.list();
            
            System.out.println("\nFiles in the src directory");
            for(String x:list1) {   System.out.println(x);       }
    }
}
