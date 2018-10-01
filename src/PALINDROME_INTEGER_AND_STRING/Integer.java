/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PALINDROME_INTEGER_AND_STRING;

import java.util.Scanner;

/**
 *
 * @author adam
 */
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {

	public static void main (String[] args) {
		Scanner sc  = new Scanner(System.in);
		int testcase = sc.nextInt();
		while(testcase-- > 0)
		{
		    StringBuilder sb = new StringBuilder();
		    int liczba = sc.nextInt();
                    String odwroc = String.valueOf(liczba);
                    
                    sb.append(odwroc);
                    sb.reverse();
                    String s = sb.toString();
                    
                    if (odwroc.equals(s) )
                    {
                        System.out.println("Yes");
                    }
                    else
                    {
                    System.out.println("No");
                    }
                    
		}
	}
}