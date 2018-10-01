/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FUNKCJA_KWADRATOWA;

import java.util.Scanner;

/**
 *
 * @author adam
 */
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int a=sc.nextInt();
		    int b=sc.nextInt();
		    int c=sc.nextInt();
		    double d=((b*b)-(4*a*c));
		    if(d<0)
		    System.out.println("Imaginary");
		    else if(d>=0){
                        d=Math.sqrt(d);
		        double x=((-b+d)/(2*a));
		        double y=((-b-d)/(2*a));
		        System.out.println((int)Math.floor(x)+" "+(int)Math.floor(y));}
		   else
		       System.out.println("No solution");}}}