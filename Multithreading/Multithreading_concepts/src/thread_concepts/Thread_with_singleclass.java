package thread_concepts;

public class Thread_with_singleclass extends Thread {
    public void run() {
        int i=1;
        while(true) {
            System.out.println(i + "    Function : Hello");
            i++;
        }
    }

public static void main(String args[]) {
        Mythread obj = new Mythread()  ;
      obj.start();   // will in-turn call run method
      int i=1;
      
      while(true) {
          System.out.println(i + "  Main :  World");
      }
    }

}

