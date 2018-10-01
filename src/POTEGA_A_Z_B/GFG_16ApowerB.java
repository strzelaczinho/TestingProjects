/*
a = 0011 1100
b = 0000 1101
-----------------
a&b = 0000 1100
a|b = 0011 1101
a^b = 0011 0001
~a  = 1100 0011
 */
package POTEGA_A_Z_B;

/**
^ (bitwise XOR)	Binary XOR Operator copies the bit if it is set in one operand but not both.	(A ^ B) will give 49 which is 0011 0001
 */
/*package whatever //do not write package name here */

import java.util.Scanner;

public class GFG_16ApowerB {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		// testcase
		int tc = sc.nextInt();

		while (tc-- > 0) {
			// ask for two numbers
			int a = sc.nextInt();
			int b = sc.nextInt();

			//result
			long r = Math.round(Math.pow(a, b));
			
			// just convert double to int then print
			System.out.print(r);

			if (tc > 0)
				System.out.println();
		}
	}
}