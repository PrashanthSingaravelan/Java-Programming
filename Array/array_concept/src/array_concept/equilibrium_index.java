package array_concept;

public class equilibrium_index {

static void equilibrium_index_value(int arr1[]) {
           
    int index  = arr1.length / 2;
    int left_sum=0, right_sum=0;

    for(int i=0; i<index; i++)            { left_sum+=arr1[i]; }
    for(int i=index+1; i<arr1.length;i++) { right_sum+=arr1[i]; }

    if (left_sum == right_sum) System.out.println(index + " is equilibrium index");
    else { System.out.println(index + " is not equilibrium index"); }
    
}

public static void main(String[] args) {
    int arr1[] = {-7, 1, 5, 2, -4, 3, 0};
    equilibrium_index_value(arr1);
  }
}
