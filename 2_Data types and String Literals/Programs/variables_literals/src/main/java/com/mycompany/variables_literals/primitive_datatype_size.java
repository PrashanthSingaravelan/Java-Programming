package com.mycompany.variables_literals;
import java.util.Scanner; 
import java.io.*;

public class primitive_datatype_size {
    
    	static void mat(int r,int c)
    {
        int[][] a = new int[50][50];  
        Scanner in = new Scanner(System.in);
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                a[i][j] = in.nextInt(); 
            }
        }
         System.out.println("MATRIX:");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.println(a[i][j]);
            }
             System.out.println("\n");
        }
    }
    
    
    public static void main(String args[]) {
        
        int r,c;
        Scanner i = new Scanner(System.in);
        r=i.nextInt();
        c=i.nextInt();
        mat(r, c);
        
//        System.out.println("Byte bytes   : " + Byte.BYTES);
//        System.out.println("Maximum Byte Range : " + Byte.MAX_VALUE);
//        System.out.println("Minimum Byte Range : " + Byte.MIN_VALUE); 
//        
//        System.out.println("Integer bytes : " + Integer.BYTES);
//        System.out.println("Minimum Integer Range : " + Integer.MIN_VALUE);
//        System.out.println("Maximum Integer Range : " + Integer.MAX_VALUE);    
    }
}
