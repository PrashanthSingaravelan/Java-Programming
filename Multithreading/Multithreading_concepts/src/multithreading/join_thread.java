package multithreading;
/*
class Mythread extends Thread {
    public void run() {
        int count=1;
                while(true) {
                    System.out.println(count++);
                }
    }
}

public class join_thread {
    public static void main(String args[]) {
       Mythread th1 = new Mythread();
       th1.setDaemon(true);
       th1.start();
       
      Thread mainthread = Thread.currentThread();
      
      try {  mainthread.join(); }      
      catch (InterruptedException e) {  System.out.println(e);   }
  }
}
*/

class Mythread extends Thread {
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + "  is Started");
            Thread.sleep(100);
            System.out.println(Thread.currentThread().getName() + " is Completed");
        }
        catch(InterruptedException e) {
            System.out.println(e);
        }
    }
}
public class join_thread {
    public static void main(String args[]) {
          Thread mainthread = Thread.currentThread();    // main thread
          System.out.println(mainthread.currentThread().getName() + " is started");
          
          Thread th = new Mythread();
          th.start();
          //try {  th.join(); }      
          //catch (InterruptedException e) {  System.out.println(e);   }
          
          System.out.println(mainthread.currentThread().getName() + " is completed");        
    }
}