package com.mycompany.variables_literals;

import java.util.Scanner;

public class Variables_literals {
    
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
    
        // primitive data-types
    public static void main(String[] args) {
                
        int r,c;
        Scanner i = new Scanner(System.in);
        r=i.nextInt();
        c=i.nextInt();
        // mat(r, c);
    
    }
}
