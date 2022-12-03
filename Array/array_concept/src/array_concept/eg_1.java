package array_concept;

public class eg_1 {
    public static void main(String[] args) {
        int arr1[] = {90,88,91,96,78};
        System.out.println("Array length : " + arr1.length);
        for(int i:arr1) { System.out.println(i); }
        
        // total marks and percentage of marks
        int sum1 = 0;
        for(int i:arr1) { sum1+=i; }
        System.out.println("Total sum : " + sum1);
        
        int n1 = 500;
        
        // sum1 to float | then divide by n1
        System.out.println("Total Percentage : " + (float)sum1/n1);
        
        // integer division (sum1/n1) getting 0 and then convert to float
        System.out.println("Total Percentage : " + (float)(sum1/n1));
        
        // float division (sum1/n2) getting 0 and then convert to float
        float n2 = 500;
        System.out.println("Total Percentage : " + (float)(sum1/n2));
        
        
    }
}
