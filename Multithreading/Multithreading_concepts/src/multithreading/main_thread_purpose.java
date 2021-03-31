package multithreading;

class NewThread implements Runnable {
    String name;    // name of the thread
    Thread th;  // Thread object
    NewThread(String thread_name) {   // contructor for your thread
        this.name = thread_name;
        th = new Thread(this,name);     // th --> horse and this --> cart
        th.start();   // start() will internally call run()
    }
    public void run() {
        try {
            for(int i=5;i>0;i--) {
                System.out.println(name + " : " + i);    // for our convenience we are making sleep to reduce the execution time
                th.sleep(1000);  // threads are sleeping for 1 second
            }
        }
        catch(InterruptedException e) {
                    System.out.println("Interrupted");
           }
            System.out.println("thread  " + name + "   exiting");    // after sleeping the thread sleeps 
        }
}

public class main_thread_purpose {
    public static void main(String args[]) {
        new NewThread("one");    // creating thread-1 with Runnable Interface
        new NewThread("two");   // creating thread-2 with Runnable Interface
        try { 
            Thread.sleep(100);    // main thread sleeps for 10 seconds  and waits for other threads to finish
        }
        catch(InterruptedException e){
            System.out.println("Main thread interrupted");
        }
        System.out.println("Main thread is exiting");
    }
}






