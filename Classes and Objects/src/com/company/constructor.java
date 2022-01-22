package com.company;

public class constructor {
    int id;
    String name;

                    /* Default constructor */
    constructor() {
        this.id = 100;
        this.name = "Simply waste";
    }
                    /*  Parameterized Constructor  */
    constructor(int i,String element) {
        this.id = i;
        this.name = element;
    }

                        /* Copy constructor */
    constructor(constructor S) {
        this.id = S.id ;
        this.name = S.name;
    }

    void Display() {
        System.out.println("id : "+id);
        System.out.println("Name : "+name);
    }
}

                /*Main method for constructor class*/
/*
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
*/
