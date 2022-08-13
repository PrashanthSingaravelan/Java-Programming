package collections;

import java.util.TreeSet;
import java.util.Iterator;

public class tree_set {
    public static void main(String[] args) {
                   TreeSet<String> ts = new TreeSet<String>();
	ts.add("A");    ts.add("B");     ts.add("C");     
                   ts.add("D");    ts.add("E");     ts.add("F");     
	System.out.println(ts);
	System.out.println("First element : " + ts.first());
	System.out.println("Last element : " + ts.last());
	String n="D";
        
                    // Single element greater than D
	System.out.println("Element just greater than "  + n + " : " + ts.higher(n));
        
                    // Single element lesser than D
	System.out.println("Element just lower than "  + n + "    : " + ts.lower(n));
        
                   // Set of elements greater than D
	System.out.println("Head Set: "+ts.headSet(n));  
        
                   // Set of elements lesser than D
	System.out.println("Tail Set: "+ts.tailSet(n)); 
        
        Iterator i_desc = ts.descendingIterator();
        System.out.print("The elements in the descending order : ");
        while(i_desc.hasNext())  { System.out.print(i_desc.next()); }
        
      }
}



