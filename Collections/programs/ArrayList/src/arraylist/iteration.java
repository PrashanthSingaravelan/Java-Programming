package arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class iteration {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>(20);
        l1.add(10); l1.add(15); l1.add(20); l1.add(25); l1.add(30);  l1.add(15);
        
        System.out.println("Normal Iteration");
        for(int i=0;i<l1.size();i++)
            System.out.print(l1.get(i) +" ");
        
        System.out.println("\n\nfor each Iteration");
        for(Integer x:l1)
            System.out.print(x+ " ");
        
        System.out.println("\n\nUsing Iterator");
        Iterator<Integer> it_obj = l1.iterator();
        while(it_obj.hasNext())
            System.out.print(it_obj.next() + " ");
        
        System.out.println("\n\nUsing List Iterator");
        ListIterator<Integer> listit_obj = l1.listIterator();
        listit_obj.next();
        while(listit_obj.hasPrevious())
            System.out.print(listit_obj.previous() + " ");
        
    }
}
