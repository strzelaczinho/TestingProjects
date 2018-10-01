/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ARRAY_MEDIANA;

/**
 *
 * @author adam
 */
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for(int j=0;j<t;j++)
		{
	       	int n = in.nextInt();
		    int[] a = new int[n];
		    for(int i =0;i<n;i++)
	     	{
		     a[i]=in.nextInt();
	    	}
		
	    	Arrays.sort(a);
	    	int mid = n/2;
	    	if(n%2 == 0)
	    	{
	    	   System.out.println((a[mid]+a[mid-1])/2);
	    	      // Math.floor((a[mid]+a[mid-1])/2));
	    	}
		    else
		      System.out.println(a[mid]);
	    } 
	}
}