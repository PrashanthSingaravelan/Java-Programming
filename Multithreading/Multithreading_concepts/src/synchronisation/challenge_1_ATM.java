package synchronisation;

class ATM {
    synchronized void checkbalance(String name) {
          System.out.println(name + " is checking the balance"); 
          try{ Thread.sleep(200);}catch(Exception e){}; // when 1 customer is using ATM, other customers must wait outside
    }
    
     synchronized void withdraw(String name, int amount) {
          System.out.println(name + " is withdrawing amount : " + amount);
          try{ Thread.sleep(500);}catch(Exception e){};  // when 1 customer is using ATM, other customers must wait outside
    }
}

class customer extends Thread {
    String name;
    int amount;
    ATM obj1 = new ATM();
    
    customer(String cust_name,int cust_amount,ATM cust_obj1) {
          this.name     = cust_name;
          this.amount = cust_amount;
          this.obj1 = cust_obj1;
    }
    
    public void book() {
        obj1.checkbalance(this.name);
        obj1.withdraw(this.name, this.amount);
}
    
    public void run() {
       //obj1.checkbalance(this.name);
       //obj1.withdraw(this.name, this.amount);
         book();  // to call both the methods checkbalance and withdraw (to maintain sync)
    }
}

public class challenge_1_ATM {
    public static void main(String args[]) {
      ATM obj1 = new ATM();
      customer th1 =   new customer("Prashanth",1000,obj1);
      customer th2 =   new customer("Mothish",10600,obj1);
      customer th3 =   new customer("Sabari",10090,obj1);
      customer th4 =   new customer("Abishek",12000,obj1);
      customer th5 =   new customer("Hrithik",15000,obj1);
      
      th1.start();
      th2.start();
      th3.start();
      th4.start();
      th5.start();
    }
}