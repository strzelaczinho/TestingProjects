/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CAKE_SLICES;

import java.util.Scanner;

/**
 *
 * @author adam
 */
class GFG
 {
	public static void main (String[] args)
	 {
		Scanner sc = new Scanner(System.in);
		int loop = sc.nextInt();
		
		while(loop-- !=0)
		{
			int n = sc.nextInt();
			
			int sum = ((int)Math.pow(n,2)+n+2)/2;
			System.out.println(sum);
		}
	 }
}
