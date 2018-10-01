/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ALFHABET_COUNTING;

import java.util.Scanner;
public class GFG_28_CountAlphabets {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int tc = Integer.parseInt(sc.nextLine());

		while (tc-- > 0) {
			// enter a string
			String s = sc.nextLine();

			// count number of alphabets in the string

			// print result
			System.out.print(countAlphabet(s));

			if (tc > 0)
				System.out.println();
		}
	}

	static int countAlphabet(String s) {
		int r = 0;

		// check each character
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
				r++;
			}
			if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
				r++;
			}
		}
		return r;
	}
}