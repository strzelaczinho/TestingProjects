/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CHECKING_SORTED_ARRAYS;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author adam
 */
class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		while(testcase-- > 0)
		{
		    int[] tablica = new int[sc.nextInt()];
		    for ( int i = 0;i<tablica.length;i++)
		    {
		        tablica[i] = sc.nextInt();
		    }
                    int a = sprawdz(tablica);
                    System.out.println(a);
		}
	}
	public static int sprawdz(int[] tablica)
	{
	    
	    int i = 0;
            while(i < tablica.length-1)
            {
                if ( tablica[i]>tablica[i+1])
                {
                    
                    return 0;
                    
                }
                ++i;
            }
		return 1;   
	}
}