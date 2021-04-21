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

// In this version of Stats, the type argument for
// T must be either Number, or a class derived
// from Number.
class Stats<T extends Number> {
T[] nums; // array of Number or subclass
// Pass the constructor a reference to
// an array of type Number or subclass.
Stats(T[] o) {
nums = o;
}
// Return type double in all cases.
double average() {
double sum = 0.0;
for(int i=0; i < nums.length; i++)
sum += nums[i].doubleValue();
return sum / nums.length;
}

boolean sameAvg(Stats<?> ob){
    if(average() == ob.average())
        return true;
    return false;
}

}
public class BoundsDemo {
    public static void main(String args[]) {
Integer inums[] = { 1, 2, 3, 4, 5 };
Stats<Integer> iob = new Stats<Integer>(inums);
double v = iob.average();
System.out.println("iob average is " + v);
Double dnums[] = { 1.1, 2.2, 3.3, 4.4, 5.5 };
Stats<Double> dob = new Stats<Double>(dnums);
double w = dob.average();
System.out.println("dob average is " + w);
// This won't compile because String is not a
// subclass of Number.
// String strs[] = { "1", "2", "3", "4", "5" };
// Stats<String> strob = new Stats<String>(strs);
// double x = strob.average();
// System.out.println("strob average is " + v);
Float fnums[] = { 1.0F, 2.0F, 3.0F, 4.0F, 5.0F };
Stats<Float> fob = new Stats<Float>(fnums);
double x = fob.average();
System.out.println("fob average is " + x);

// See which arrays have same average.
System.out.print("Averages of iob and dob ");
if(iob.sameAvg(dob))
System.out.println("are the same.");
else
System.out.println("differ.");
System.out.print("Averages of iob and fob ");
if(iob.sameAvg(fob))
System.out.println("are the same.");
else
System.out.println("differ.");



}
}
