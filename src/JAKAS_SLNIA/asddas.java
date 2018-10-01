/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JAKAS_SLNIA;

/**
 *
 * @author adam
 */
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG
 {
public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		//testcase
		int tc = sc.nextInt();
		
		while(tc-->0){
			
			int n = sc.nextInt();
			
			//calculate factorial	
			System.out.print(factorial(n));
			
			if(tc>0)
				System.out.println();
		}
		
	}
	
	static long factorial(int n){
	
		long f = n ;
		
		while(n-->1){
			f*=n;
		}
		return f;
	}
}