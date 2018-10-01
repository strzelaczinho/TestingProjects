/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ARRAY_REVERSE_IN_GROUPS;

import java.util.Scanner;

/**
 *
 * @author adam
 */
class GFG123 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		for (int k=0;k<t;k++) {
		    int n = sc.nextInt();
		    int a[] = new int[n];
		    for (int i=0;i<n;i++) {
		        a[i] = sc.nextInt();
		    }
		    int g = sc.nextInt();
		    
		    printReverseInGroups(a, g);
		    System.out.println();
		}
	}
	
	static void printReverseInGroups(int a[], int g) {
	    int n = a.length;
	    int size = a.length;
	    int cur = -1;
	    int tm = 0;
	    int temp = 0;
	    
	    while (tm < size-1) {
	        
	        tm = cur + g;
	        if (tm >= size) {
	            tm = size - 1;
	        }
	        temp =  tm;
	        for (int i = tm; i>cur;i--) {
	            System.out.print(a[i] + " ");
	        }
	        
	        cur = temp;
	    }
	}
}
