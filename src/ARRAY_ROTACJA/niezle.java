/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ARRAY_ROTACJA;

import java.util.Scanner;

/**
 *
 * @author adam
 */
class GFG31 {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
		    int rozmiar = sc.nextInt();
		    int a[] = new int[rozmiar];
		    for(int i=0;i<rozmiar;i++)
		    {
		        a[i]=sc.nextInt();
		    }
		    int ilosc_rotacji = sc.nextInt();
		    for(int i=0;i<ilosc_rotacji;i++)
		    {
		        int p =a[0];
		        for(int j=0;j<rozmiar-1;j++)
		        {
		            a[j]=a[j+1];
		        }
		        a[rozmiar-1] = p;
		    }
		    for(int i=0;i<rozmiar;i++)
		    {
		        System.out.print(a[i]+" ");
		    }
		    System.out.println();
		}
	}
}
