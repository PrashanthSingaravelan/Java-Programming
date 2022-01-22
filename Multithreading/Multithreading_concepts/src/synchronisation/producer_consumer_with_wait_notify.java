package synchronisation;

class Q {
          int n;
          boolean valueSet = false;
          
          synchronized int get() {
                    while(!valueSet)    // not of valueSet                   
                    try {     wait();           } 
                    catch(InterruptedException e) { System.out.println("InterruptedException caught");       }
                    
                    System.out.println("Got: " + n);
                    valueSet = false;
                    notify();
                    return n;
          }
          
          synchronized void put(int n) {
                     while(valueSet)     // valueSet                   
                     try {   wait();        }
                    catch(InterruptedException e) {   System.out.println("InterruptedException caught");      }   
                        this.n = n;
                        valueSet = true;
                        System.out.println("Put: " + n);
                        notify();
          }
}

class Producer_2 implements Runnable {
            Q q;
            Producer_2(Q q) {
             this.q = q;
            new Thread(this, "Producer_2").start();
            }
            public void run() {
                       int i = 0;
                       while(true) {      q.put(i++);           }
            }
    }

class Consumer_2 implements Runnable {
            Q q;
            Consumer_2(Q q) {
            this.q = q;
            new Thread(this, "Consumer_2").start();
        }
            public void run() {
            while(true) {        q.get();          }
          }
}

public class producer_consumer_with_wait_notify {
    public static void main(String args[]) {
            Q q = new Q();
            new Producer_2(q);
            new Consumer_2(q);
            System.out.println("Press Control-C to stop.");
    }
}

