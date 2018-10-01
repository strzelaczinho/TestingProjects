/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PERMUTACJA_Z_SILNIA;

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
        int test = sc.nextInt();
        while (test-- > 0)
        {
            int a  = sc.nextInt();
            int b = sc.nextInt();
            
            long wynik = silnia(a)  ;
            long wynik2 = silnia(a - b);  // (n!) / (n -r)!
            long wynik3 = wynik/wynik2;
            System.out.println(wynik3);
        }
        
		
	}
	static long silnia(int num) {
	   if (num <= 1) return 1;
	   else return num*silnia(num -1);
}
}