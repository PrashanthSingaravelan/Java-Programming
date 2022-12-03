package array_concept;

public class merge_two_sorted_array {
    
static int[] sort_array(int[] arr) {

    // implenting bubble sort
    for(int i=0;i<arr.length;i++)      {
       for(int j=i+1;j<arr.length;j++)  {

           // swapping the 2 elements
           if (arr[i] > arr[j])     {
               int temp = arr[i]; arr[i] = arr[j]; arr[j] = temp;
           }
        }
    }
   return arr;
}
    
static int[] merge_sort_array(int[] arr1, int[] arr2) {
    int merge_sorted_array[] = new int[arr1.length + arr2.length];
    int i=0;
    int j=0;
    int count=0;

    // stop if any of the array traversal is completed
    do {
        if (arr1[i]<arr2[j]) { merge_sorted_array[count++] = arr1[i];  i++;  }
        else                 { merge_sorted_array[count++] = arr2[j];  j++; }
    } while(i!=arr1.length && j!=arr1.length);

    // see which array is remaining
    // arr1 is remaining
    if (i<arr1.length)  {
        while (i<arr1.length) { merge_sorted_array[count++] = arr1[i]; i++; }
    }

    // arr2 is remaining 
    else {  while (j<arr2.length) { merge_sorted_array[count++] = arr2[j]; j++; }   
    }
        
    return merge_sorted_array;
}
    
public static void main(String[] args) {
    int arr1[] = {4,5,1,6};
    int arr2[] = {6,2,3,8};
    
    int sort_arr1[] = {};
    int sort_arr2[] = {};
    int ans[] = {};

    sort_arr1 = sort_array(arr1);
    sort_arr2 = sort_array(arr2);
    ans = merge_sort_array(arr1, arr2);

    System.out.print("Sorted array-1 : ");
    for(int i:sort_arr1) { System.out.print(i); }
    
    System.out.print("\nSorted array-2 : ");
    for(int j:sort_arr2) { System.out.print(j); }

    System.out.print("\nSorted merged array : ");
    for (int cnt:ans) { System.out.print(cnt); }
    }
}
