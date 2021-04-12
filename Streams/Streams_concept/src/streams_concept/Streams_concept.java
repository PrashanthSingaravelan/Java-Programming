import java.util.*;  
  
public class Streams_concept {  
   public static void main(String[] args) {  
       Scanner sc =new Scanner(System.in);
       String n;
       n=sc.next();
       StringTokenizer st = new StringTokenizer(n);  
       int []a=new int[5];
       for (int x = 0; x <5; x++)
            a[x]=Integer.parseInt(st.nextToken(","));
        
        int element = 5;
        for(int i=0;i<5;i++) {
            if (a[i]==element)          { System.out.println("element " + element + " is found");    }
        }
        
        int big = 500000;
        int small = -500000;
        for(int i=0;i<5;i++) {
            if (a[i]<big)             { big = a[i];   }
            if (a[i]>small)         { small = a[i]; }
        }
        System.out.println("Largest element is " + small);
        System.out.println("Smallest element is " + big);
         
        int sum1 = 0;
        int sum1_even = 0; 
        
        for(int i=0;i<5;i++) {
            sum1 = a[i]; 
            if (a[i]%2==0) { sum1_even+=a[i]; }
        }
        System.out.println("Sum : " + sum1);
        System.out.println("Sum of even numbers : " + sum1);
    }
}