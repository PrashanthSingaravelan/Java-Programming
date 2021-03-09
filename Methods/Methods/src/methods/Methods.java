package methods;
public class Methods {    
static int max(int a,int b) {      // a and b --> formal parameter
          if (a>b) 
                return a; 
          else if (b>a)
                return b; 
          else
              return 0;
}

static void inc(int a) {
        a++;
        System.out.println("Inside inc() a : " + a);
}
 
    public static void main(String[] args) {      // x and y --> actual parameter
        int x = 10,y = 15;
        inc(x);
        System.out.println("Inside main() x : " + x);
    }    
}
