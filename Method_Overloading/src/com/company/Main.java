package com.company;

public class Main {

    public static void main(String[] args) {
        passing_objects_as_arguments obj1 = new passing_objects_as_arguments(10,20);
        passing_objects_as_arguments obj2 = new passing_objects_as_arguments(100,100);
        passing_objects_as_arguments obj3 = new passing_objects_as_arguments(0,0);

        System.out.println(" " + obj1.Equal(obj1));    // obj1(implicit) and obj1(explicit) also
        System.out.println(" " + obj1.Equal(obj2));    // obj1(implicit) and obj2(explicit) also
        System.out.println(" " + obj1.Equal(obj3));    // obj1(implicit) and obj3(explicit) also
    }
}
