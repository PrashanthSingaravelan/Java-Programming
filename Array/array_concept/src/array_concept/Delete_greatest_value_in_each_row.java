package array_concept;

public class Delete_greatest_value_in_each_row {
    
    static int max_sum      = 0;
    static int temp_max_sum = 0;
    
    public static int[] maximum(int arr[]) {
    // implenting bubble sort
    for(int i=0;i<arr.length;i++)      {
       for(int j=i+1;j<arr.length;j++)  {

           // swapping the 2 elements
           if (arr[i] > arr[j])     {
               int temp = arr[i]; arr[i] = arr[j]; arr[j] = temp;
           }
        }
    }
        int last_element = arr[arr.length-1];
        System.out.println("Last element : " + last_element);
        
        if (temp_max_sum<last_element) { temp_max_sum=last_element; }
        arr[arr.length-1] = 0;

        return arr;
    }
    
    public static void main(String[] args) {
        int grid[][] = new int[][] {{10}};
        
        int row = grid.length;
        int col = grid[0].length;
        
        int max_outer = 0;
        
        if (row>col) 
            max_outer= row;
        else 
            max_outer= col;
        
        
        for(int outer=0;outer<max_outer;outer++) {
        
            for(int i=0;i<grid.length;i++) {    // per matrix
                grid[i] = maximum(grid[i]);
            }
            max_sum += temp_max_sum;
            System.out.println("Temp max : " + temp_max_sum);
            temp_max_sum = 0;
        }
        
        System.out.println(max_sum);
    }
}
