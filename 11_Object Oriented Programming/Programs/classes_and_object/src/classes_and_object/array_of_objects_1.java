package classes_and_object;

public class array_of_objects_1 {
    
    public static class Account {
        int customer_serial;
        String customer_name;
        int customer_balance;

        // Parameterized Constructor
        public Account(int no,String name,int balance) {
            this.customer_serial   = no;
            this.customer_name     = name;
            this.customer_balance  = balance;            
        }

        void deposit(int amount)  {
            this.customer_balance = this.customer_balance + amount;
            System.out.println(this.customer_name + " Your balance is : " + this.customer_balance);
        }

        void withdraw(int amount) {
            this.customer_balance = this.customer_balance - amount;
            System.out.println(this.customer_name + " Your balance is : " + this.customer_balance);
        }  
    }
    
    public static void main(String[] args) {
        Account obj1[]  = new Account[3];
            
        obj1[0] = new Account(1,"Prashanth",10_000);
        obj1[1] = new Account(2,"Mothish",50_000);
        obj1[2] = new Account(3,"Hrithik",90_000);

        obj1[0].deposit(100);
        obj1[2].withdraw(20_000);            
    }
}
