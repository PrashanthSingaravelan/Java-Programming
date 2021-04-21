package generics_basics;

class gen<T> {
        T[] obj1_arr1;
        gen( T array_from_main[])          {    this.obj1_arr1 = array_from_main;     }
        void display() {   // iterating over items in the array of T type
            for (T item:this.obj1_arr1)        {     System.out.printf("%s  ",item);        }
    }
}

public class Basics_5 {
    public static void main(String args[]) {
          Integer arr1[] = { 10,20,30,40,50};           // int arr1[] = { 10,20,30,40,50} --> not working
          gen<Integer> obj1 = new gen(arr1);
          System.out.println("Intger array : ");       obj1.display();
          
          Double arr2[] = {19.2 , 89.4 , 78.3 , 89.4 , 56.3};   // double arr1[] = { 10,20,30,40,50};  --> not working
          gen<Double> obj2 = new gen(arr2);
          System.out.println("\nDouble array : ");      obj2.display();    
          
          String arr3[] = { "Prashanth" , "Praveen" , "Dhoni" , "Sam Curran" };   
          gen<Double> obj3 = new gen(arr3);
          System.out.println("\nString array : ");          obj3.display();    
    }
}
