/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SATISFY_THE_EQUATION;

import java.util.Scanner;

/**
 *
 * @author adam
 */
public class asd {
    public static void main (String[] args)
	 {
	 Scanner inp= new Scanner(System.in);
		int testCases = Integer.parseInt(inp.nextLine());
		for (int t=0;t<testCases;t++)
                {
		int val=inp.nextInt();
		long x=Math.round(Math.cbrt(val));
                System.out.println("Wartosc val = "+x);
		
			int count=0;
			for (int i=0;i<=x;i++)
                        {
			 for (int j=1;j<=x;j++)
                            {	
				 int sum=(int) (Math.pow(i, 3) + Math.pow(j, 3));
				 //System.out.println("i="+i+" j="+j+" a="+a);
				if (sum == val)
                                    {
                                        System.out.println("Spełnia  "+Math.pow(i, 3) + " "+ Math.pow(j, 3)+" = "+sum);
					count++;
                                    }
                            }
			}
			System.out.println(count);
		}
	
	}
}
