package exercise;

public class maximum_digit_in_a_number {
    public static void main(String[] args) {
      int num1 = 58102;
      int arr1[] = new int[5];
      int cnt = 0;
      
      int quotient  = num1 / 10;
      int remainder = num1 % 10;
      
      arr1[cnt++] = remainder;
      
      while (remainder < quotient) {
         quotient  = quotient / 10;
         remainder = quotient % 10;
         arr1[cnt++] = remainder;
      }
      
      for(int i=0;i<arr1.length;i++) {
          for(int j=i+1;j<arr1.length;j++) {
              if (arr1[i]>arr1[j]) {   // swapping the array elements
                  int temp = arr1[i];
                  arr1[i]  = arr1[j];
                  arr1[j]  = temp;
              }
          }
      }
      
        System.out.println("Maximum digit : " + arr1[4]);
      
    }
}
