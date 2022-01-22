package synchronisation;
        
class Q1 {
    int n;
    synchronized int get() {
    System.out.println("Got: " + n);
    return n;
}
synchronized void put(int n) {
                        this.n = n;
                        System.out.println("Put: " + n);
            }   
        }

class Consumer_1 implements Runnable {
                    Q q;
                     Consumer_1(Q q) {
                     this.q = q;
                     new Thread(this, "Consumer_1").start();
            }
                     public void run() {
                     while(true) {    q.get();             }
           }
}

class Producer_1 implements Runnable {
                Q1 q;
                Producer_1(Q1 q) {
                this.q = q;
                new Thread(this, "Producer_1").start();
        }
                        public void run() {
                        int i = 0;
                        while(true) {
                        q.put(i++);
                }   
    }
}

public class producer_consumer {    
    public static void main(String args[]) {
        Q1 q = new Q1();
        new Producer_1(q);
        new Consumer_1(q);
        System.out.println
        ("Press Control-C to stop.");
    }
}








