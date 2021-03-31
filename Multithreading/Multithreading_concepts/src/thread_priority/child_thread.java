package thread_priority;

class MyThread extends Thread {
    public void run()  {
        System.out.println("Inside the run thread");
    }
}

public class child_thread {
    public static void main(String args[]) {
           Thread.currentThread().setPriority(6);
           System.out.println("Main thread is : " + Thread.currentThread().getPriority());
           
           Thread t1 = new MyThread();
           System.out.println("Thread t1 priority : "  + t1.getPriority());
    }
}

