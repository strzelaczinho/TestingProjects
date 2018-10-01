/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package STRING_STARS;

import java.util.Scanner;

/**
 *
 * @author adam
 */
import java.util.*;
import java.lang.*;
import java.io.*;

public class GFG_30_PatternPrinting {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int tc = sc.nextInt();

		while (tc-- > 0) {
			// enter n term
			int n = sc.nextInt();

			// print pattern
			print(n);

			if (tc > 0)
				System.out.println();
		}
	}

	public static void print(int n) {
		for (int i = 0; i < n; i++) {
			int j = 0;
			while (j++ <= i)
                        {
				System.out.print("*");
			}
			//add spaces between
			if (i < n-1)
				System.out.print(" ");
		}
	}
}
