package com.company;
import java.util.Arrays;  /*class contains a static factory that allows arrays to be viewed as lists.*/

public class Main {

    public static void main(String[] args) {

        String cars[] = {"Volvo", "BMW", "KIA", "Maruthi"};
        for (int i = 0; i < cars.length; i++) {    /*Accessing the array elements*/
            System.out.println(cars[i]);
        }

                        /*Sum of array elements*/
        int arr1[] = {12, 31, 89, 56, 49};
        int sum1 = 0;
        for (int i = 0; i < arr1.length; i++) {
            sum1 = sum1 + arr1[i];
        }
        System.out.println("The sum is : "+sum1);

                        /*Reversing an array*/
        int reverse[] = new int[arr1.length];
        for(int i=0,j=arr1.length-1;i<arr1.length;i++,j--)  // Only 1 condition can be given
        {
            reverse[i] = arr1[j];
        }
        System.out.println("Main : " + Arrays.toString(arr1));
        System.out.println("Reverse : " + Arrays.toString(reverse));
    }
}