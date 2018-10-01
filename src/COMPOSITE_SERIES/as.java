/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package COMPOSITE_SERIES;

import java.util.Scanner;

/**
 *
 * @author adam
 */
class GFG 
{
    public static boolean isComp(int n)
    {
        for(int i=2; i<n; ++i)
        {
            if(n%i == 0)
                return true;
        }
        return false;
    }
	public static void main (String[] args)
        {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-- > 0)
                {
		    int N = sc.nextInt();
		    for(int i=4; i<=N; ++i)
                    {
		        if(isComp(i))
                        {
		            System.out.print(i+" ");
		        }
		    }
		    System.out.println();
		}
	}
}
