package thread_concepts;

class Mythread extends Thread {
    public void run() {
        int i=1;
        while(true) { 
            System.out.println(i + " Function:Thread"); 
            i++; 
        }
    }
}

public class Multithreading_concepts {
     public static void main(String args[]) {
         Mythread th1 = new Mythread();
         th1.start();
         int j = 1;
         
         while(true) { 
            System.out.println(j + " Function:Main"); 
            j++; 
        }   
     }
}
