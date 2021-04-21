package generics_basics;

class Stats<T extends Number> { // Number can be byte,short,int,float,double, 
    T[] obj_arr1;
    Stats(T[] obj_main) {       this.obj_arr1 = obj_main;      }
    double average() {
        double sum = 0.0;
        for(int i=0;i<this.obj_arr1.length;i++) {   sum = sum + this.obj_arr1[i].doubleValue();      }
        return (sum/this.obj_arr1.length);
    }
    boolean same_avg(Stats<?> obj1_main ){
        // this.average() == average
            if (this.average() == obj1_main.average())          {   return true;    }
            else { return false; }
        }
}

public class wild_card {
    public static void main(String args[]) {
          Integer arr1_main[] = {10,20,30,40,50};
          Stats<Integer> int_obj1 = new Stats(arr1_main);
          System.out.println("Integer Average is : " + int_obj1.average() );
        
          Double arr2_main[]  = {90.43 , 89.12 , 34.12 , 89.23};
          Stats<Double> float_obj1  = new Stats(arr2_main);
          System.out.println("Double Average is : " + float_obj1.average() );
          
          System.out.println(int_obj1.same_avg(float_obj1));
    }
}
