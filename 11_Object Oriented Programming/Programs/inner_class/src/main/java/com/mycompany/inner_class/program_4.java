package com.mycompany.inner_class;

import java.util.Scanner;

// Java static nested class example with instance method

class TestOuter {
    static int data=30; 
    // int data=30; --> Cannot access
    static class Inner   {  void msg() { System.out.println("data is "+data);}  } 

}

public class program_4 {
    public static void main(String args[]){ 
//        Scanner obj1 = new Scanner(System.in);
//        int var1 = obj1.nextInt();
//        
//        int arr1[] = new int[5];
//        
//        for (int i=0;i<2;i++) {
//            arr1[i] = obj1.nextInt();
//        }
//        TestOuter.Inner obj=new TestOuter.Inner(); 
//        obj.msg(); 
double i , j ,k;
i = 1.2;
j = 2.3;
k = i * j * j;
System.out.println(k);
 
 
 
  
 }


 } 
