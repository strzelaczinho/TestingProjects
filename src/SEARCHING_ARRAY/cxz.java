/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEARCHING_ARRAY;

/**
 *
 * @author adam
 */
/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		int t=0,n=0,k=0,i;
		Scanner sc= new Scanner(System.in);
	t=sc.nextInt();
	while(t-->0)
	{
	    n=sc.nextInt();
	    int []a=new int[n];
	    for( i=0;i<n;i++)
	    a[i]=sc.nextInt();
	    k=sc.nextInt();
	    for(i=0;i<n;i++)
	    {
	    if(a[i]==k)
	    {
	    System.out.println(i);
	    break;
	    }
	    if(i==n-1)
	     System.out.println("-1");
	    }
	    
	}
		
	}
}
/*
Given an integer array and an element x, find if element is present in array or not. If element is present, then print index of its first occurrence. Else print -1.

Input:

First line contains an integer, the number of test cases 'T' Each test case should contain an integer, size of array 'N' in the first line. In the second line Input the integer elements of the array in a single line separated by space. Element X should be inputted in the third line after entering the elements of array.

Output:

print the output in a separate line returning the index of the element X.If element not present then print -1.

Constraints:

1 <= T <= 100

1 <= N <= 100

1 <= Arr[i] <= 100

Example:

Input:
1
4
1 2 3 4
3

Output:
2

Explanation:
There is one test case with array as {1, 2, 3 4} and element to be searched as 3.  Since 3 is present at index 2, output is 2
*/