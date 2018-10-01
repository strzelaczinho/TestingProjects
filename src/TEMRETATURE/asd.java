/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TEMRETATURE;

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
		int liczba = sc.nextInt();
		
		while(liczba -- > 0)
		{
		    double stopnie = sc.nextInt();
		    double wynik = (stopnie * 1.8) + 32;
		    
		   System.out.println((int)wynik);
		}
	}
}