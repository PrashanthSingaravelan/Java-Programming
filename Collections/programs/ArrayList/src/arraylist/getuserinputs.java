package arraylist;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class getuserinputs {
    public static void main(String[] args) {
        Scanner scn_obj     = new Scanner(System.in);
        
        System.out.print("Enter n : ");
        int n = scn_obj.nextInt();
        
        System.out.print("Enter Array elements : ");
        
        List<Integer> list1 = new ArrayList<Integer>(n);
        int i=0;
        while(i<n) {
            i++;
            list1.add(scn_obj.nextInt());
        }
        
// even after size is assigned intially, still we can able to increase the array size
        list1.add(10); 
        
        System.out.println("Normal Printing : " + list1);
        
        // for-each
        System.out.println("for-each Printing : ");
        for(int element:list1) 
            System.out.print(element);
        
        System.out.println(list1.size());  // size = n 
    }
}
