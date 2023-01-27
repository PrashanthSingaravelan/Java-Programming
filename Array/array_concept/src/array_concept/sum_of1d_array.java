package array_concept;

public class sum_of1d_array {
    public static void main(String[] args) {
        int nums[] = new int[] {1,2,3,4};
        
        int ans[] = new int[nums.length];
        
        for(int i=0;i<nums.length;i++) {
            int temp = 0;
            for(int j=0;j<i+1;j++) {
                temp+=nums[j];
            }
            ans[i] = temp;
        }
        
        for(int k:ans) { System.out.println(k); }
    }
}
