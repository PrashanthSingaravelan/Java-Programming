package generics_basics;

class Data<T> {
        private T obj1;
        
        void setdata(T item_from_main) { this.obj1 = item_from_main; }
        
        T getdata()     {     return this.obj1;     }
}

public class Basic_1 {
    public static void main(String args[]) {
        /*                          Integer 
          Data<Integer> obj_main = new Data<Integer>();
          obj_main.setdata(10);
          System.out.println(obj_main.getdata()); */
        
        /*                             String  
          Data<String> obj_main = new Data<String>();
          obj_main.setdata("Prashanth");
          System.out.println(obj_main.getdata());  */
    }
}
