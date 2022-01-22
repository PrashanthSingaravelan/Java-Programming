package com.company;

public class Account  {
    String name;
    int account_type;
    int account_number;
    float balance;

                        /*Defining the parameterized construtor */
    Account(String name,int account_type,int account_number,float balance) {
        this.name = name;
        this.account_type = account_type;
        this.account_number = account_number;
        this.balance = balance;
    }

    public void deposit(int x) {
        this.balance = this.balance + x;
    }

    public void withdraw(int x) {
        this.balance = this.balance - x;
    }

    public void enquire() {
        System.out.println("Account Name : " + this.name);
        System.out.println("The balance is " + this.balance);
    }
}
                        /*Main method for account class*/
/*
    public static void main(String[] args) {

        Account obj1 = new Account("Prashanth", 1, 9003, 100);
        Account obj2 = new Account("Mothish", 2, 6003, 500);
        Account obj3 = new Account("Monica", 3, 1567, 1000);
        Account obj4 = new Account("Ross", 4, 8932, 5000);

        obj1.deposit(300);
        obj2.deposit(800);
        obj3.deposit(200);
        obj4.deposit(100);

        obj1.withdraw(70);
        obj2.withdraw(50);
        obj3.withdraw(12);
        obj4.withdraw(80);

        obj1.enquire();
        obj2.enquire();
        obj3.enquire();
        obj4.enquire();
}*/
