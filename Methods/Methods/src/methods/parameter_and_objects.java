public class Methods {

    static void update(int A[],int index,int element) {  // Array is a object
        A[index] = element;
    }
    public static void string_change(String str_obj) { // String is a object
        str_obj = "Hello";
    }
    
    static void change(int p, int value) {
        p = value;
    }
    
    public static void main(String args[]) {
            
            // Passing objects (as a reference)
    
            int X[] = {2,3,4,5,6};
            update(X,3,150);
            System.out.println("Array elements : ");
            for(int i=0;i<5;i++) {
            System.out.print(X[i] + " "); }
    
            System.out.println();
            String normal_str = "prashanth";
            
            // Passing primitives (call by value)
            
            string_change(normal_str);    
            System.out.println("primitives --> inside main() :" + normal_str); 
    
            int p = 20;
            change(p,30);
            System.out.println("p-value in main() :" + p);
        }
    }
    
    
    
    
    