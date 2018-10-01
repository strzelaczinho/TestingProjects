/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PROSTOPADLOSCIAN_CUBOID;

import java.util.Scanner;

/**
 *
 * @author adam
 */
public class asdasd {
   public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int liczba = sc.nextInt();
		
		while(liczba -- > 0)
		{
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    int c = sc.nextInt();
		    System.out.println(2*a*b+2*a*c+2*b*c + " " + a*b*c);
		}
	}
}
