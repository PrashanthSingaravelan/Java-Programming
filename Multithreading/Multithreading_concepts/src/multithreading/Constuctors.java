package multithreading;

/*
class Mythread implements Runnable {  // threads class implementing Runnable interface
    public void run() { 
        System.out.println("Thead started");
    }
}

public class Constuctors {
    public static void main(String args[]) {
            
          Thread th = new Thread(new Mythread() , "Prashanth");
          th.start();
          System.out.println("Name of the thread : " + th.getName());
            
            
          System.out.println("Thead ends");
    }
}
*/

class Mythread extends Thread {   
    public Mythread(String name) {
        super(name);   // Thread class is having a contructor which will take the name
    }
}

public class Constuctors {
    public static void main(String args[]) {
        Mythread th = new Mythread("Prashanth");
        System.out.println("Name of the thread : " + th.getName());
    }
}




