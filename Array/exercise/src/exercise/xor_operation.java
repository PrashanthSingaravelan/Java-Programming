package exercise;

public class xor_operation {
    
    public static int getXOR(int x, int y)  { return (x | y) & (~x | ~y); }
    
    public static void main(String[] args) {
        int x=2;
        int y=3;
        
        System.out.println(x|y);
        System.out.println(~x|~y);
        System.out.println((x|y) & (~x|~y));
        
        int encoded[] = {1,2,3}; 
        int first = 1;
        
        int arr1[]       = new int[encoded.length+1];
        int arr1_index   = 0;
        arr1[arr1_index] = first;
        
        for(int i=0;i<arr1.length;i++) {
            //arr1[arr1_index++] =  getXOR(arr1[arr1_index], encoded[arr1_index]);
            System.out.println(arr1[arr1_index]);
            System.out.println(encoded[arr1_index]);
            arr1_index++;
            arr1[arr1_index] =  getXOR(arr1[arr1_index-1], encoded[arr1_index-1]);
            System.out.println("");
        }
        
        
    }
}
