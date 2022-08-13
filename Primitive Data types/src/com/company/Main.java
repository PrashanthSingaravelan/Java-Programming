package com.company;

public class Main {

    public static void main(String[] args) {
    							/*int data-type*/
	int min_value = Integer.MIN_VALUE;
	int max_value = Integer.MAX_VALUE;

	System.out.println("The minimum value is : " + min_value);
	System.out.println("The maximum value is : " + max_value);

	/*Underflow occurs when we assign such a value to a variable which is less than the minimum permissible value.
	Overflow occurs when we assign such a value to a variable which is more than the maximum permissible value. */

	System.out.println("Busted Minimum value : " + (min_value-1));   /*underflow*/
	System.out.println("Busted Maximum value : " + (max_value+1));   /*overflow*/

	int num1 = 2_147_483_647;   /*For easy reading Will be accepted*/
	System.out.println(num1);

								/*byte data-type*/
	byte min_byte = Byte.MIN_VALUE;
	byte max_byte = Byte.MAX_VALUE;

	System.out.println("Byte Minimum value : " + min_byte);
	System.out.println("Byte Maximum value : " + max_byte);

								/*short data-type*/
	short min_short = Short.MIN_VALUE;
	short max_short = Short.MAX_VALUE;

	System.out.println("Short Minimum value : " + min_short);
	System.out.println("Short Maximum value : " + max_short);

								/*long data-type*/
	long numi1 = 100l;   /*long should always ends with l*/
	long numi2 = 2_147_483_647_892_129l;
	System.out.println(numi2);

	long min_long = Long.MIN_VALUE;
	long max_long = Long.MAX_VALUE;

	System.out.println("Long Minimum value : " + min_long);
	System.out.println("Long Maximum value : " + max_long);
    }
}
