package synchronisation;

class MyData {
    int value;
                            /* To achieve inter-thread communication */
    boolean flag = true;
    
    synchronized public void set(int v) {
        // Making consumer to wait while producer produces an item
        while(flag!=true) {  // wait() will wait only for few milli-seconds, but we want wait() to be executing
                try{ wait(); } catch(InterruptedException e) {}                    // untill the flag becomes true.
          }
        this.value = v;
        flag = false;    // should tell the consumer, it is your turn to consume
        notify(); 
    }
    
    synchronized public int get() {
           int x=0;
           // Making producer to wait while consumer is consuming an item
           while(flag!=false) {
               try{ wait(); } catch(InterruptedException e) {}
           }
           x = value;
           flag = true;  // should tell the producer, it is your turn to produce
           notify();
           return x;
    }
}

class Producer extends Thread {
        MyData obj1_data;
        Producer(MyData d) {  this.obj1_data = d;     }
        public void run()  {
            int cnt=1;
            while(true) {
                obj1_data.set(cnt);
                System.out.println("Producer produced : " + cnt);
                cnt++;
            }
        }
}

class Consumer extends Thread {
         MyData obj1_data;
         Consumer(MyData d) { this.obj1_data = d;    }
         public void run() {
             int value;
             while(true) {
                 value = obj1_data.get();
                 System.out.println("Consumer consumed : " + value);
             }
         }
}

public class Inter_thread_producer_consumer {
    public static void main(String args[]) {
        MyData obj1_data = new MyData();
        Producer p_th1       = new Producer(obj1_data);
        Consumer c_th1      = new Consumer(obj1_data);
        
        p_th1.start();
        c_th1.start();
    }
}
