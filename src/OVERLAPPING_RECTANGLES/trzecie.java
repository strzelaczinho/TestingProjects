/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OVERLAPPING_RECTANGLES;

import java.util.Scanner;

/**
 *
 * @author adam
 */
class GFG3 {
	public static void main (String[] args) {
		int T;
		int l1, t1, r1, b1;
		int l2, t2, r2, b2;
		Scanner sc = new Scanner(System.in);
		T = sc.nextInt();
		while(T-- > 0){
		    l1=sc.nextInt();
		    t1=sc.nextInt();
		    r1=sc.nextInt();
		    b1=sc.nextInt();
		    l2=sc.nextInt();
		    t2=sc.nextInt();
		    r2=sc.nextInt();
		    b2=sc.nextInt();
		    
		    if(l2 > r1 || r2 < l1 || b2 > t1 || t2 < b1){
		        System.out.println("0");
		        continue;
		    }
		  
		    System.out.println("1");
		}
		
	}
}