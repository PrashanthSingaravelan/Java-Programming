package synchronisation;

class WhiteBoard {
    String text;
    int number_of_students = 0;
    int count = 0;
    
    public void attendance() {   // all students must give attendance while entering the class.
           number_of_students++;
    }
    
    synchronized public void write(String message ) {   // teacher is writing the message
          System.out.println("Teacher is writing " + message);
          while(count != 0) {                                       // student is trying to read when teacher is writing 
              try{wait();} catch(Exception e) {}         // student must wait
          }
          this.text    = message;                                        // message from teacher
          this.count = this.number_of_students;      // teacher --> finished, now it is students turn to read
          notifyAll();                                                        // notifying all the sleeping students 
    }
    
    synchronized public String read() {
          while(count == 0) {                                               // teacher is trying to write when student is reading
                     try{wait();} catch(Exception e) {}         // teacher must wait
          }
          String t = text;   // student is reading from the board
          count--;              // student --> finished, now its next student turn to read. Once all student read, teacher can write
          
          // notifying the sleeping teacher when all the students finished reading
          if (count==0) { notify();   }
          return t;
    }
}

class Teacher extends Thread {
        WhiteBoard obj1;    // obj1 --> to access the white board
        String message[] = {"If you get a product free" , "Then you are the product" , "Make hay while the sun shines" };
        public Teacher(WhiteBoard obj_from_main) { this.obj1 = obj_from_main; }
        
        public void run() {
             // teacher is writing in white board
             for(int i=0;i<message.length;i++) {
                     obj1.write(message[i]);    // sending the message one-by-one
             }
        } 
}

class Student extends Thread {
        WhiteBoard obj1;
        String name;   // student name
        Student(String name_from_main , WhiteBoard obj_from_main)  {
            this.name = name_from_main;   // name of the student
            this.obj1   = obj_from_main;
        }
        
          public void run() {
              String text;
              obj1.attendance();  // student is  calling the attendance
              
              do {
                    text = obj1.read();                                                                // student is reading from the board
                    System.out.println(name + " is reading " + text);       // student is writing into the note
                    System.out.flush();
              }while(!text.equals("end"));
          }
}


public class challenge_2_teacher_student_whiteboard {
    public static void main(String args[]) {
          WhiteBoard obj1 = new WhiteBoard();
        
          Teacher th_main = new Teacher(obj1);
          
          Student th1 = new Student("1. Prashanth",obj1);
          Student th2 = new Student("1. Mothish",obj1);
          Student th3 = new Student("1. Hrithik",obj1);
          Student th4 = new Student("1. Sabs",obj1);
            
            th_main.start();
            
            th1.start();
            th2.start();
            th3.start();
            th4.start();
          
    }
}
