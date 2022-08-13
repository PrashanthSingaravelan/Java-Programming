package bounds_on_generics;

class Stats<T extends Number> { // Number can be byte,short,int,float,double, 
    T[] obj_arr1;
    Stats(T[] obj_main) {       obj_arr1 = obj_main;      }
    double average() {
        double sum = 0.0;
        for(int i=0;i<obj_arr1.length;i++)          {   sum = sum + obj_arr1[i].doubleValue();      }
        return (sum/obj_arr1.length);
    }
}

public class bounded_types_1 {
    public static void main(String args[]) {
          Integer arr1_main[] = {10,20,30,40,50};
          Stats<Integer> obj1 = new Stats(arr1_main);
          System.out.println("Integer Average is : " + obj1.average() );
        
          Double arr2_main[]  = {90.43 , 89.12 , 34.12 , 89.23};
          Stats<Double> obj2  = new Stats(arr2_main);
          System.out.println("Double Average is : " + obj2.average() );
    }
}
