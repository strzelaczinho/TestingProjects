/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TRIANGLE_GROWING_DOWN;

import java.util.Scanner;

/**
 *
 * @author adam
 */
public class wersja_dobra2 {
    	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();
		while(T-- > 0){
		    String str = sc.nextLine();
		    int len = str.length();
		    for(int i=0; i<len; ++i)
                    {
		        for(int j=len-i-1; j>0; --j)
                        {
		            System.out.print(".");
		        }
		        System.out.print(str.substring(0,i+1));
		        System.out.println();
		    }
		}
	}
}
