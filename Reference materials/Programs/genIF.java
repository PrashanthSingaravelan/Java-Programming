/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generics;

/**
 *
 * @author Admin
 */

// A generic interface example.
// A Min/Max interface.
interface MinMax<T extends Comparable<T>> {
T min();
T max();
}
// Now, implement MinMax
class MyClass<T extends Comparable<T>> implements MinMax<T> {
T[] vals;
MyClass(T[] o) { vals = o; }
// Return the minimum value in vals.
public T min() {
T v = vals[0];
for(int i=1; i < vals.length; i++)
if(vals[i].compareTo(v) < 0) v = vals[i];
return v;
}
// Return the maximum value in vals.
public T max() {
T v = vals[0];
for(int i=1; i < vals.length; i++)
if(vals[i].compareTo(v) > 0) v = vals[i];

return v;
}
}
class genIF {
public static void main(String args[]) {
Integer inums[] = {3, 6, 2, 8, 6 };
Character chs[] = {'b', 'r', 'p', 'w' };
MyClass<Integer> iob = new MyClass<Integer>(inums);
MyClass<Character> cob = new MyClass<Character>(chs);
System.out.println("Max value in inums: " + iob.max());
System.out.println("Min value in inums: " + iob.min());
System.out.println("Max value in chs: " + cob.max());
System.out.println("Min value in chs: " + cob.min());
}
}

