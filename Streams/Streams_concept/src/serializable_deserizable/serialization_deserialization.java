package serializable_deserizable;

import java.io.Serializable;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

class Student implements Serializable {
        private int roll_no;
        private String name;
        private float avg;
        private String dept_name;
        public static int data = 10;
        public transient int t = 24042001;
        
        public Student(int roll_main, String name_main, float avg_main, String dept_name_main) {
                   this.roll_no       = roll_main;
                   this.name          = name_main;
                   this.avg             = avg_main;
                   this.dept_name = dept_name_main;
                   this.data = 400;
                   this.t = 800;
        }
        
        @Override
        public String toString() {
                return "\nStudent Details\n" + 
                            "\nRoll             : " + this.roll_no + 
                            "\nName          : " + this.name + 
                            "\nAverage      : " + this.avg + 
                            "\nDept Name  : " + this.dept_name + 
                            "\nDate(static)  : " + this.data + 
                            "\nt(transient)   : " + this.t;
                  }
    }

public class serialization_deserialization {
    public static void main(String args[]) throws Exception {
         FileOutputStream fos     = new FileOutputStream("sample_3.txt");
         ObjectOutputStream os  = new ObjectOutputStream(fos);
         
         Student obj_write = new Student(1010,"Prashanth",345,"M.Tech Data-Science");
         os.writeObject(obj_write);  // serialization of object
         
         os.close();
         fos.close();
         
         FileInputStream fis     = new FileInputStream("sample_3.txt");
         ObjectInputStream is  = new ObjectInputStream(fis);
         
         Student obj_read = (Student)is.readObject();  // deserialization of object
         System.out.println(obj_read);   // printing the object (String toStirng())
         
         is.close();
         fis.close();
    }
}
   