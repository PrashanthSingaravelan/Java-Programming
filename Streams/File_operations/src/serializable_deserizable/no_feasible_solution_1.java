package serializable_deserizable;

import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;

class Student {
    int roll;
    String name;
    String dept_name;
}

public class no_feasible_solution_1 {
    public static void main(String args[]) throws Exception {
                            // wrting the object members into the file
         FileOutputStream fos = new FileOutputStream("sample_1.txt");
         PrintStream pos = new PrintStream(fos);
         
         Student obj1 = new Student();
         obj1.roll = 19;                 obj1.name="Prashanth";      obj1.dept_name = "M.tech Data-Science";
         pos.println(obj1.roll);    pos.println(obj1.name);        pos.println(obj1.dept_name);
         
         pos.close();
         fos.close();
         
                         // reading the object members from the file
         FileInputStream fis = new FileInputStream("sample_1.txt");
         BufferedReader br  = new BufferedReader(new InputStreamReader(fis));
         
         Student obj2 = new Student();
         obj2.roll = Integer.parseInt(br.readLine());  // reading the string and then type-casting into int and then storing
         obj2.dept_name = br.readLine();
         obj2.name = br.readLine();
         
         System.out.println("Roll            : " + obj2.roll);
         System.out.println("Name         : " + obj2.name);
         System.out.println("Dept Name : " + obj2.dept_name);
         
         br.close();
         fis.close();
    }
}
