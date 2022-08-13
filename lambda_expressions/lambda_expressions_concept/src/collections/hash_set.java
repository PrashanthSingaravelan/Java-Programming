package collections;

import java.util.Iterator;
import java.util.HashSet;

public class hash_set {
    public static void main(String[] args) {
          HashSet<String> hs=new HashSet();  
          hs.add("S");         hs.add("A");          hs.add("N");
          hs.add("J");         hs.add("A");         hs.add("N");           
          Iterator<String> i=hs.iterator();  
          while(i.hasNext())   {   System.out.print(i.next());            }  
    }      
}


