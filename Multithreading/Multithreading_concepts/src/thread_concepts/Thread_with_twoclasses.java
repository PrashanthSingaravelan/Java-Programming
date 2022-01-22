package thread_concepts;

class Mythread extends Thread {
    public void run() {
        int i=1;
        while(true) {
            System.out.println(i + "   Class Function : Hello");
            i++;
        }
    }
}

public class Thread_with_twoclasses {
    public static void main(String args[]) {
      Mythread obj = new Mythread()  ;
      obj.start();   // will in-turn call run method
      int i=1;
      
      while(true) {
          System.out.println(i + "  Main :  World");
      }
    }
}