/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GWIAZDKI_POZIOMO;

import java.util.Scanner;

/**
 *
 * @author adam
 */
class GFG {
	public static void main (String[] args) {
		Scanner id =new Scanner(System.in);
		int t= id.nextInt();
		for(int i=0;i<t;i++)
                {
		    int n = id.nextInt();
		    print(n);
		    System.out.println();
		}
	}
	
	static void print(int n) {
	    int k =0;
	    for(int i=n;i>=1;i--)
            {
	        for(int j=0;j<2*k-1;j++) 
                {
	            System.out.print(" ");
	        }
	        for(int j=0;j<2*i-1;j++)
                {
	            System.out.print("*");
	        }
	     
	        k++;
	   }
                                }
}