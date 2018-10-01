/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ARRAYS_NEXT_SMALLER_ELEMENT;

import java.util.Scanner;

/**
 *
 * @author adam
 */
class GFG {
	
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
       int testcase = sc.nextInt();
       while(testcase-- > 0)
       {
	   int  n = sc.nextInt();
	    int[] arr = new int[n];
	    for(int i=0;i<n;i++) // index out of bounds, it should be i<n
	    arr[i] = sc.nextInt();
	    for(int i=0;i<n-1;i++)   //as you are dealing with a arr[i+1] element, so for i=n-1
	    {                   // the array goes out of bound so i<n-1
	        if(arr[i+1]>=arr[i])   
	        System.out.print("-1 ");
	        else if(arr[i+1]<arr[i])
	        System.out.print(arr[i+1]+" ");
	    }
	    System.out.print("-1 \n");   //the last elemet will always be -1
       }
    }
}
