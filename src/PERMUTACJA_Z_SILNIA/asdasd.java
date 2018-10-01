/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PERMUTACJA_Z_SILNIA;

import java.util.Scanner;

/**
 *
 * @author adam
 */
public class asdasd {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int tc = sc.nextInt();

		while (tc-- > 0) {
			// enter values for n and r
			int n = sc.nextInt();
			int r = sc.nextInt();

			// compute nPr
			long npr = compute(n, r);

			// display result
			System.out.print(npr);

			if (tc > 0)
				System.out.println();
		}
	}

	static long compute(int n, int r) {

		long result = factorial(n) / factorial(n - r);

		return result;
	}

	static long factorial(int num) {
		long f = num;

		// factorial of 0! == 1
		if (num == 0) {
			return 1;
		}

		while (num-- > 1) {
			f *= num;
		}

		return f;
	}
}