package Piped_Streams;

import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.IOException;

class Producer extends Thread {
        PipedOutputStream pos;
        Producer(PipedOutputStream pos_main) {  this.pos = pos_main;     }   
        synchronized public void run() {
            int count = 1;
            while(true) {
                try{
                        pos.write(count);
                        System.out.println("Producer produced : " + count);
                        count+=1;
                        pos.flush();
                        Thread.sleep(10);
                } catch(Exception e) {}
            }
        }
}

class Consumer extends Thread {
        PipedInputStream pis;
        Consumer(PipedInputStream pis_main) { this.pis = pis_main; }
        synchronized public void run() {
        int x;
        try {
                while(true) {
                    Thread.sleep(10);
                    x = pis.read();
                    System.out.println("Consumer consumed : " + x);
                }
        }   catch(Exception e) {}
    }
}

public class Producer_Consumer {
    public static void main(String args[]) throws IOException {
         PipedInputStream pis     = new PipedInputStream();
         PipedOutputStream pos = new PipedOutputStream();
         
         pis.connect(pos);      // or pos.connect(pis)
         
         Producer p = new Producer(pos);
         Consumer c = new Consumer(pis);
         
         p.start();
         c.start();
    }
}
