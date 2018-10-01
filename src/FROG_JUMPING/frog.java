/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FROG_JUMPING;

import java.util.Scanner;

/**
 *
 * @author adam
 */
class GFG {
	public static void main (String[] args) {
		int t, n, i;
		Scanner sn = new Scanner(System.in);
		t = sn.nextInt();
		while(t-- > 0)
                {
		    n = sn.nextInt();
		    i = 1;
		    while(i < n)
                    {
		        i += i;
                        System.out.print(i+" ");
                    }
                    System.out.println();
		    if(i == n)
		        System.out.println("True");
		    else
		        System.out.println("False");
		}
	}
}