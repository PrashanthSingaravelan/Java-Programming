package hashset;

import java.util.HashSet;

public class Hashset {
    public static void main(String[] args) {
        HashSet<String> hs1 = new HashSet<String>();
        hs1.add("Prashanth"); hs1.add("Kamal"); hs1.add("Rahul"); hs1.add("Sam");
        System.out.println("hash-set size : " + hs1.size());
        
        HashSet<String> hs2 = new HashSet<String>();
        hs2 = hs1;
        
        
    }
}
