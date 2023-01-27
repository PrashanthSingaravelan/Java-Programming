package array_concept;

import java.util.ArrayList;
import java.util.List;

public class concatenation_of_array {
    public static void main(String[] args) {
        int nums[] = new int[] {1,2,1};
        
        List<Integer> nums_expand = new ArrayList<Integer>();
        
        for(int i=0;i<2;i++) {
            for(int j:nums)
                nums_expand.add(j);
        }
        
        Integer[] nums_expand_int = nums_expand.toArray(new Integer[nums_expand.size()]);
        for(int i:nums_expand_int) 
            System.out.println(i);
        
    }
}
