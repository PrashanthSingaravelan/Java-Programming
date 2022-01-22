package com.company;

public class Main {
    /* Paste your code here */
    public static void main(String args[]) {
        constructor obj1 = new constructor();
        constructor obj2 = new constructor(1,"prashanth");
        constructor obj3 = new constructor(obj1);

        System.out.println("Default constructor : ");
        obj1.Display();

        System.out.println("Parameterized constructor : ");
        obj2.Display();

        System.out.println("Copy constructor : ");
        obj3.Display();
    }
}