package thread_priority;

class clicker implements Runnable {
    long click = 0;
    Thread th;
    
    private volatile boolean running = true;    // doesn’t created in cache memory. It is stored and retrieved from RAM.
    
    public clicker(int p) {        // Parameterised constructor 
          th = new Thread(this);
          th.setPriority(p);
    }
    
    public void start() {     // user-defined function
            th.start();      // Start will In-turn will call run()
    }
    
    public void run() {
        while(running) {
            click++;
        }
    }
    
    public void stop() {    // user-defined function
        running = false;    // to stop the run()
    }
}

public class thread_priorities {
    public static void main(String args[]) {
           Thread.currentThread().setPriority(Thread.MAX_PRIORITY);   // main thread is set to MAX_PRIORITY
        
          clicker hi  = new clicker(Thread.NORM_PRIORITY + 2);     // hi --> Maximum priority
          clicker lo  = new clicker(Thread.NORM_PRIORITY - 2);      // lo --> Minimum priority
            
          lo.start();
          hi.start();
            
          try {
                     Thread.sleep(1000);
            }  catch (InterruptedException e) {
                    System.out.println("Main thread is interrupted");
            }
            
            lo.stop();
            hi.stop();
            
          // waiting for the child thread to terminate
          try {
              hi.th.join();     // Main thread should wait for hi thread
              lo.th.join();    // Main thread should wait for lo thread
              // So, main thread should wait for hi,lo thread
              
          } catch (InterruptedException e ) {
              System.out.println("Interrupted exception caught");
          }
          
          System.out.println("Low priority thread  :  " + lo.click);
          System.out.println("High priority thread :  " + hi.click);
    }
}



