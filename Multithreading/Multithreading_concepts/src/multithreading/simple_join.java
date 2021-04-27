package multithreading;

public class simple_join {
    public static void main(String args[]) throws InterruptedException {
        System.out.println(Thread.currentThread().getName()  +  "  is started");
        Thread obj1 = new Thread() {
        
        public void run() {
        try {
                System.out.println(Thread.currentThread().getName()  +  "  is started");
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName()  +  "  is completed");
        }
        catch (InterruptedException e) {
            System.out.println(e);
        }
    }
};
        obj1.start();
        // obj1.join();
        
        System.out.println(Thread.currentThread().getName()  +  "  is completed");
    }
}
