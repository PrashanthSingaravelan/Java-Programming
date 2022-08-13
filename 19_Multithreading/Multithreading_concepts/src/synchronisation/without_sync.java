package synchronisation;

class class_shared {
    public void display(String str) {     // will display the string passed to it.
        for(int i=0;i<str.length();i++) {
            System.out.print(str.charAt(i));
            try{ Thread.sleep(1000); } catch(InterruptedException e) {   System.out.println(e);   }
            }
        }
}

class Mythread1 extends Thread {
    
    class_shared obj_data1;      // thread creating object for Mydata class
    Mythread1(class_shared data) {
        this.obj_data1 = data;      // connecting thread object with the shared class object
    }
    
    public void run() {
        obj_data1.display("Thread-1  Good Morning     ");
    }
}

class Mythread2 extends Thread {
    
    class_shared obj_data2;    // thread creating object for Mydata class
    Mythread2(class_shared data) {
        this.obj_data2 = data;   // connecting thread object with the shared class object
    }
    
    public void run() {
        obj_data2.display("Thread-2 Hello everyone       ");
    }
}

class Mythread3 extends Thread {
    
    class_shared obj_data3;    // thread creating object for Mydata class
    Mythread3(class_shared data) {
        this.obj_data3 = data;   // connecting thread object with the shared class object
    }
    
    public void run() {
        obj_data3.display("Thread-3 Bye       ");
    }
}

public class without_sync {
    public static void main(String args[]) {
        class_shared obj_shared = new class_shared();
        Mythread1 th1 = new Mythread1(obj_shared);
        Mythread2 th2 = new Mythread2(obj_shared);
        Mythread3 th3 = new Mythread3(obj_shared);
        
        th1.start();
        th2.start();
        th3.start();
    }
}


