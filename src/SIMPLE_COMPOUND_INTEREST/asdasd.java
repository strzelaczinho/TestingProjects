/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SIMPLE_COMPOUND_INTEREST;

import java.util.Scanner;

/**
 *
 * @author adam
 */
public class asdasd {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int tc = sc.nextInt();
		
		while(tc-->0){
			//principal amount, time(years),compound n times in a year
			int p_amount = sc.nextInt();
			int t = sc.nextInt();
			int n = sc.nextInt();
			//rate
			double rate = sc.nextInt()*.01;
			
			//compute future value
			double amount = p_amount*(Math.pow(1 + (rate / n), n*t));
			
			//display in floor value, converted to int(to remove decimals)
			System.out.print((int)Math.floor(amount));
			
			if(tc>0)
				System.out.println();
		}
	}
}
