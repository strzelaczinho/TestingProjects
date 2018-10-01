/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VOWELS;

/**
 *
 * @author adam
 */
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		while(testcase-- > 0)
		{
		    String s = sc.next();
		    String z = "aeiouAEIOU";
		    if (z.contains(s))
		    {
		        System.out.println("YES");
		    }
		    else {
		        System.out.println("NOT");
		    }
		}
	}
}