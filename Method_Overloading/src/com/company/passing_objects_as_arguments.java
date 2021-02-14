package com.company;

public class passing_objects_as_arguments {
    int a,b;

    passing_objects_as_arguments(int num1,int num2) {
        this.a = num1;
        this.b = num2;
    }

    boolean Equal(passing_objects_as_arguments new_obj) {
        if (new_obj.a == new_obj.b) {
            System.out.print(" a : " + new_obj.a + " b : " +new_obj.b);
            return true;
        }
        else {
            System.out.print(" a : " + new_obj.a + " b : " +new_obj.b);
            return false;
        }
    }
}

/*
Main function

    public static void main(String[] args) {
        passing_objects_as_arguments obj1 = new passing_objects_as_arguments(10,20);
        passing_objects_as_arguments obj2 = new passing_objects_as_arguments(100,100);
        passing_objects_as_arguments obj3 = new passing_objects_as_arguments(0,0);

        System.out.println(" " + obj1.Equal(obj1));    // obj1(implicit) and obj1(explicit) also
        System.out.println(" " + obj1.Equal(obj2));    // obj1(implicit) and obj2(explicit) also
        System.out.println(" " + obj1.Equal(obj3));    // obj1(implicit) and obj3(explicit) also
    }
*/
