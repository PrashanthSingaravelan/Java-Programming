/*parameters --> same , return type --> different */
package com.company;

public class Adder1 {
    int x,y;
    double a,b;

    Adder1(int num1, int num2, double num3, double num4) {
        this.x = num1;
        this.y = num2;

        this.a = num3;
        this.b = num4;
    }

    public int Add1(int x,int y) {
        return x+y;
    }

    public double Add1(double a,double b){
        return a+b;
    }
}


/*
Main function
    public static void main(String[] args) {

    Adder1 obj1 =new Adder1(0,0,0,0);
    System.out.println("Int function : " + obj1.Add1(10,11));
    System.out.println("Double function : " + obj1.Add1(11.22222222222222222222222222,12.411111111111111111111111111111));
    }
*/
