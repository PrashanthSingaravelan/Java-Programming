/*parameters --> different , return type --> same*/
package com.company;

public class Adder {
            int a,b,c;
            double x,y,z;

    Adder(int num1,int num2,int num3) {
        this.a = num1;
        this.b = num2;
        this.c = num3;
    }

    public static int Add(int a,int b) {
        return a+b;
    }

    public static int Add(int a,int b,int c) {
        return a+b+c;
    }
}

/*
Main function
    public static void main(String[] args) {
    Adder obj1 =new Adder(0,0,0);
    System.out.println("Functions (two arguements) : " + obj1.Add(10,11));
    System.out.println("Functions (three arguements) : " + obj1.Add(10,11,12 ));
}
*/
