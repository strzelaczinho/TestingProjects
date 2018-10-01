/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BIKES;

import java.util.Scanner;

/**
 *
 * @author adam
 */
class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-- > 0){
		    int N = sc.nextInt();
		    double dist = 0;
		    for(int i=1; i<=N; ++i){
		        dist = dist + (double)100/i;
		    }
		    System.out.println((int)dist);
		}
	}
}
