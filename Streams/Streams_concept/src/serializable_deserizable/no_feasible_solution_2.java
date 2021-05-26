package serializable_deserizable;

import java.io.FileOutputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.DataOutputStream;

class Student {
    int roll_no;
    String name;
    String dept_name;
}

public class no_feasible_solution_2 {
    public static void main(String args[]) throws Exception {
                                // wrting the object members into the file
         FileOutputStream fos = new FileOutputStream("F:\\github\\Java-Programming\\Streams\\Streams_concept\\src\\serializable_deserizable\\sample_2.txt");
         DataOutputStream dos = new DataOutputStream(fos);
         
         Student obj1 = new Student();
         obj1.roll_no = 19;                 obj1.name="Prashanth";      obj1.dept_name = "M.tech Data-Science";
         
         dos.writeInt(obj1.roll_no);
         dos.writeUTF(obj1.name);
         dos.writeUTF(obj1.dept_name);
         
         dos.close();
         fos.close();
         
                                    // reading the object members into the file
         FileInputStream fis = new FileInputStream("F:\\github\\Java-Programming\\Streams\\Streams_concept\\src\\serializable_deserizable\\sample_2.txt");
         DataInputStream dis = new DataInputStream(fis);
         
         Student obj2 = new Student();
         obj2.roll_no       = dis.readInt();
         obj2.name          = dis.readUTF();
         obj2.dept_name = dis.readUTF();
         
         System.out.println("Roll            : " + obj2.roll_no);
         System.out.println("Name         : " + obj2.name);
         System.out.println("Dept Name : " + obj2.dept_name);
         
         dis.close();
         fos.close();        
    }
}
