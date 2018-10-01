/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MAX_MIN_CONVERSION;

import java.util.Scanner;

/**
 *
 * @author adam
 */
public class asdas {
  	public static void main (String[] args) {
		//code
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	while(t-->0)
	{
	    String s=sc.next();
	    String s1=s.replaceAll("6","5");
	    String s2=s.replaceAll("5","6");
	    int a=Integer.parseInt(s1);
	    
	    int b=Integer.parseInt(s2);
	    System.out.println(a+b);
	}
	    
	}
}
/*
Given a no N you can perform an operation in it in which you can change a digit 5 to 6 and vice versa. Now your task is to print the sum of the max no and the min no obtained by performing such operations.

Input:
The first line of input contains an integer T denoting the no of test cases. Then T test case follow . Each test case contains a number N.

Output:
For each test case in a new line print the required sum.

Constraints:
1<=T<=100
1<=N<=10000

Example:
Input:
2
35
5
Output:
71
11

Explanation:
For first test case
The max no which can be formed is 36 and the min no which can be formed is 35 itself 
sum : 36+35 = 71
For second test case
sum : 5+6 = 11
*/