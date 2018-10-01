/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BINARY_ARRAY_SORTING;

import java.util.Arrays;
import java.util.Scanner;


class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		while(testcase-- > 0)
		{
		    int[] tablica = new int[sc.nextInt()];
		    for (int i = 0;i<tablica.length;i++)
		    {
		        tablica[i] = sc.nextInt();
		        
		    }
                    Arrays.sort(tablica);
		    for (int i = 0;i<tablica.length;i++)
                    {
                        System.out.print(tablica[i]+" ");
                    }
                    System.out.println();
		}
	}
}
