package collections.comparator;

import java.util.ArrayList;
import java.util.Collections;

class student implements Comparable <student> {
    int roll_no;
    String name;
    int age;
    
    student(int roll_no_main, String name_main , int age_main) {
        this.roll_no = roll_no_main;
        this.name    = name_main;
        this.age       = age_main;
    }

    @Override  // defining the method of the comparable interface
    public int compareTo(student o) {
        if(this.age==o.age)        { return 0;      }
        else if (this.age>o.age) {  return 1;   }
        else                                {  return -1;   }
    }
}

public class based_age {
    public static void main(String[] args) {
        ArrayList<student> al = new ArrayList<student>();
        al.add(new student(101,"Prashanth",45));
        al.add(new student(102,"Kumar",54));
        al.add(new student(103,"Ram",21));
        
        System.out.println("Before sorting ");
        for(student x:al) {
            System.out.println("Roll no : " + x.roll_no +
                    "   Name : " + x.name + 
                    "   Age : " + x.age);
            }
        
        Collections.sort(al);
        
        System.out.println("After sorting ");
        for(student x:al) {
            System.out.println("Roll no : " + x.roll_no +
                    "   Name : " + x.name + 
                    "   Age : " + x.age);
            }
      }    
}
