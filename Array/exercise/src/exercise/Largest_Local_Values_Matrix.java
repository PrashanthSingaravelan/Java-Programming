package exercise;
import java.util.Arrays;

public class Largest_Local_Values_Matrix {
    static int arr1[][]   = {{1,1,1,1,1},{1,1,1,1,1},{1,1,2,1,1},{1,1,1,1,1},{1,1,1,1,1}};
    static int range      = arr1.length - 2;
    static int answer[][] = new int[range][range];
    
    public static int max(int row, int col) {
        int maximum_value = 0;
        for(int i=row; i<row+range; i++) { 
            for(int j=col; j<col+range; j++) {
                if (maximum_value < arr1[i][j]) 
                    maximum_value = arr1[i][j];
            }
        }
        return maximum_value;
    }
    
    public static void main(String[] args) {

        for(int i=0;i<range;i++) {
            for(int j=0;j<range;j++) {
                answer[i][j] = max(i,j);
            }
        }
        
        for(int[] rc: answer) {  
            System.out.println(Arrays.toString(rc));
        }
  }
}

