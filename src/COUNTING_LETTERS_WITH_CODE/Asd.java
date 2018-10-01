/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package COUNTING_LETTERS_WITH_CODE;

/**
 *
 * @author adam
 */
/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG2 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int liczba = sc.nextInt();
		while(liczba-- > 0)
		{
		    int[] tablica = new int[sc.nextInt()];
		    int flaga = sc.nextInt();
                    
                    for (int i = 0;i<tablica.length;i++)
                    {
                        tablica[i] = sc.nextInt();
                    }
		    int wieksze = 0;
		    int mniejsze= 0;
		   for(int j= 0;j<tablica.length;j++)
		    {
		        if(tablica[j]>=flaga)
                            mniejsze++;
                        if(tablica[j]<=flaga)
                            wieksze++;
                       
		    }
		    System.out.print(wieksze+" "+mniejsze);
		    System.out.println();
		}
	}
}