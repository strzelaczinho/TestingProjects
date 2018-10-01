/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PERFECT_NUMBER;

import java.util.Scanner;

/**
 *
 * @author adam
 */

    class GFG {
	public static void main (String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		int liczba = sc.nextInt();
		while(liczba-->0)
		{
		    int sprawdz = sc.nextInt();
                    String zamiana = String.valueOf(sprawdz);
		    
		    if (zamien(zamiana) == sprawdz)
                    {
                        System.out.println("Perfect");
                    }
                    else {
                        System.out.println("Not Perfect");
                    }
		}
		
	}
	static int silnia (int n )
	{
	    if (n <=1) return 1;
	    else return n*silnia(n-1);
	}
        static int zamien(String liczba)
        {
            char[] chars = liczba.toCharArray();
            int[] result = new int[chars.length];
            for(int i=0; i<chars.length; i++)
            {
            result[i] = Character.getNumericValue(chars[i]);
            
            }
            int suma = 0;
            for(int i = 0;i<result.length;i++)
            {
                suma += silnia(result[i]);
            }
            
            return suma;
        }
}

