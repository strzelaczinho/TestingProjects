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
class GFG1 {
	public static void main (String[] args) {
		//code
		Scanner sc=new Scanner(System.in);
		int tc=sc.nextInt();
		for(int t=0;t<tc;t++)
		{
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=sc.nextInt();
			if(a==0)
			{
					System.out.println("Invalid");
					continue;
			}
			b=-b;
			double x=b*b-4*a*c;
			if(x<0)
			{
				System.out.println("Imaginary");
				continue;
			}
			double sqrt=Math.sqrt(x);
			int root1=(int)Math.floor((b+sqrt)/(2*a));
			int root2=(int)Math.floor((b-sqrt)/(2*a));
			System.out.println(root1+" "+root2);
		}
	}
}