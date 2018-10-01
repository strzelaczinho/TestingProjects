/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PERFECT_SQUARE;

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
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		while(testcase-- > 0)
		{
		    double liczba = sc.nextInt();
		    double wynik = Math.sqrt(liczba);
		    int wynik2 =(int) Math.sqrt(liczba);
		    if ( wynik2 == wynik)
		    {
		        System.out.println(1);
		    }
		    else {
		        System.out.println(0);
		    }
		    
		}
	}
}
