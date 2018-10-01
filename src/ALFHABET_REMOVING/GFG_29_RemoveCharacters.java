/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ALFHABET_REMOVING;

import java.util.Scanner;

public class GFG_29_RemoveCharacters {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int tc = Integer.parseInt(sc.nextLine());

		while (tc-- > 0) {
			// enter string
			String s = sc.nextLine();

			// remove characters from the string
			// display result
			System.out.print(rmChars(s));

			if (tc > 0)
				System.out.println();
		}
	}

	static String rmChars(String s) {
		String result = "";

		// iterate each character
		for (int i = 0; i < s.length(); i++) {
			// add to string if it's not an alphabet character
			if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z' || s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
				// splash! / do nothing
			} else {
				// add char to string
				result += s.charAt(i);
			}
		}
		return result;
	}
}