package array_concept;

import java.util.Scanner;

public class array_transpose {
    public static void main(String[] args) {
        int arr1[][] = new int[2][2];
        
        Scanner scanner_obj = new Scanner(System.in);
        System.out.println("Enter 2*2 matrix elements");
        
        for(int i=0;i<2;i++) {
            for(int j=0;j<2;j++) {
                arr1[i][j] = scanner_obj.nextInt();
            }
        }
        
        System.out.println("Original Array");
        for(int i=0;i<2;i++) {
            for(int j=0;j<2;j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }
        
        
        System.out.println("Array Transpose");
        for(int i=0;i<2;i++) {
            for(int j=0;j<2;j++) {
                System.out.print(arr1[j][i] + " ");
            }
            System.out.println();
        }
        
        
        
    }
}
