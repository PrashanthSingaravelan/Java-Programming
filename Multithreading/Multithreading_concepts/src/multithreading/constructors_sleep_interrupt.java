package multithreading;

class Mythread extends Thread {
    Mythread(String name) {
          super(name);
    }
        public void run() {
            int count=1;
            while(true) {
                    System.out.println(count++);            
                    try {
                    Thread.sleep(1000); }   // will raise an exception and it must be caught 
                    catch(InterruptedException e) {
                            System.out.println(e);
                          }
                   }
          }
}

public class constructors_sleep_interrupt {
    public static void main(String args[]) {
       Mythread obj1 = new Mythread("Prashanth_thread");
       obj1.start();
       obj1.interrupt();   // interrupting the thread which is sleeping
     /*  
        System.out.println("ID of the thread : " + obj1.getId()); 
        System.out.println("Thread name is  : " + obj1.getName());
        System.out.println("Thread Priority  :  " + obj1.getPriority());
        obj1.start();
        System.out.println("Thread state  :  " + obj1.getState());
        System.out.println("Thread Alive/Not :   " + obj1.isAlive());  */
        
        
    }
}


