package multithreading;

class Mythread extends Thread {
    public void run() { 
        int cnt=1;
        while(true) {
            System.out.println(cnt++);
        }
    }
}

public class daemon_thread {
    public static void main(String args[]) {
        Mythread th = new Mythread();
        th.setDaemon(true);   // setting the thread to be daemon (providing services to all other threads)
        th.start();
        
        try{Thread.sleep(1);} catch(Exception e) { System.out.println(e);}
    }
}
