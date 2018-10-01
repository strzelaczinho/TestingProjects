/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BINARY_ARRAY_SORTING;

import java.util.Scanner;

/**
 *
 * @author adam
 */
public class GFG1 {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-- >0)
		{
		    int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
		    a[i]=sc.nextInt();
		}
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (a[j] > a[j+1])
                {
                    // swap temp and arr[i]
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
 for (int i=0; i<n; ++i)
            System.out.print(a[i] + " ");
        System.out.println();
		    
		}
	}
}
