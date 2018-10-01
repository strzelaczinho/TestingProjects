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
class GFG1 {
	public static void main (String[] args) {

        Scanner s = new Scanner(System.in);

        int t = s.nextInt();
        for (int i=0; i<t; i++) {
            int xl= s.nextInt(); int yl= s.nextInt();int xr= s.nextInt();int yr = s.nextInt();
            int al= s.nextInt();int bl= s.nextInt();int ar= s.nextInt();int br = s.nextInt();
            
            if ((al>xr ||(xl>ar)) )               
               
                System.out.println(0);
           else if ((br>yl) || bl<yr)
                   System.out.println(0);
           else
               System.out.println(1);      
        }
	}
}