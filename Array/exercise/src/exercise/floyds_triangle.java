package exercise;

public class floyds_triangle {
    public static void main(String[] args) {
        int num1 = 1;
        int n = 5;
        for(int i=0;i<=n;i++) {
            for(int j=0;j<i;j++) { System.out.print(num1++ + " "); }
            System.out.println("");
        }
    }
}
