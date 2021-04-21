package generics_basics;

public class onegeneralization {
    public static void main(String args[]) {
        
        /* 1 
          Object obj1;
          obj1 = new String("Prashanth");          
          obj1 = new Integer(10);
          String str = (String)obj1;    */
        
        /* 2 */
        Object obj1[] = new Object[3];
        obj1[0] = "hi";
        obj1[1] = "hello";
        obj1[2] = 10;
        
        String str1;
        for(int i=0;i<3;i++) { 
            str1 = (String)obj1[i];
            System.out.println(str1);
        }
    }
}
