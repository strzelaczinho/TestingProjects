/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SATISFY_THE_EQUATION;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author adam
 */
class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n-->0)
		{
		    int N = sc.nextInt();
		    
		    int b = 1;
		    int count = 0;
		    while(b<=Math.cbrt(N))
		    {
		        int a = N-b*b*b;
		        int cbrtDiff = (int) Math.cbrt(a);
		        if(cbrtDiff*cbrtDiff*cbrtDiff == a)
		           count++;
                           b++;     
		    }
		    System.out.println(count);
		}
	}
}