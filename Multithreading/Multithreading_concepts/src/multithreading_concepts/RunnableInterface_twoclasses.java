package multithreading_concepts;

class MyRunnable implements Runnable {
    public void run() {     // if run() is not defined this MyRunnable becomes abstract class
        int i=1;
        while(true) {
            System.out.println(i + "Class :  world");
            i++;
        }
    }
}

public class RunnableInterface_twoclasses {
    public static void main(String args[]) {
        MyRunnable obj1 = new MyRunnable();
        Thread th = new Thread(obj1);   // obj1 --> cart and th --> horse
        
        th.start();        
        int i=1;
        while(true) {
            System.out.println(i + "Main : world");
            i++;
        }       
    }
}
