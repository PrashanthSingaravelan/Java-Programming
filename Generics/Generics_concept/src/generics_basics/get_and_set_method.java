package generics_basics;

class data<T> {
    private T obj;
    public void setdata(T item_main)  { this.obj = item_main; }
    public T  getdata()  { return obj; }
}

public class get_and_set_method {
    public static void main(String[] args) {
         data<Integer> integer = new data();
         integer.setdata(10);
         System.out.println(integer.getdata());
         
         data<String> str = new data();
         str.setdata("Prashanth");
         System.out.println(str.getdata());
    }
}
