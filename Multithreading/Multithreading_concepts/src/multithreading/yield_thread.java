package multithreading;

class Mythread extends Thread {
    public void run() {
        int cnt=1;
        while(true) {
            System.out.println("My thread : " + cnt++ );
        }
    }
}

public class yield_thread {
    public static void main(String args[]) {
        Mythread th = new Mythread();
        th.start();
        
        int cnt=1;
        while(true) {
            System.out.println("Main thread : " + cnt++ );
            //Thread.yield();
        }
    }
}
