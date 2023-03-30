package thread_concepts;

public class RunnableInterface_singleclass implements Runnable{
    
    public void run() {
        int i=1;
        while(true) {
            System.out.println(i + " Inside Run");
            i++;
        }
    }

    public static void main(String args[]) {
            RunnableInterface_singleclass obj1 = new RunnableInterface_singleclass();
            Thread th = new Thread(obj1);    // th --> horse and obj1--> cart
            th.start();
            int i=1;
      
           while(true) {
                 System.out.println(i + " Inside Main");
                 i++;
            }
    } 
}
