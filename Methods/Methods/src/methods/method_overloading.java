package methods;

public class method_overloading {
    
    static byte max(byte x,byte y) {
        System.out.println("Inside byte max()");
        return x>y?x:y;
    }

    static int max(int x,int y) {
        System.out.println("Inside int max()");
        return x>y?x:y;
    }

    static float max(float x,float y) {
        System.out.println("Inside float max()");
        return x>y?x:y;
    }

    public static void main(String args[]) { 
    byte a=10,b=14;
    System.out.println("(int)The highest is : " + max(a,b));
    System.out.println("(int)The highest is : " + max(10,14));
    System.out.println("(float)The highest is : " + max(12f,25f));
    }
}
