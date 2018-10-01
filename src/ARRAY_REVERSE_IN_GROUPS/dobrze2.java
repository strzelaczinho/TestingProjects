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
public class dobrze2 {
   
     public static void main(String args[])
     {
         Scanner scan=new Scanner(System.in);
         int h=scan.nextInt();
         for(int i=0;i<h;i++)
         {
             int size=scan.nextInt();
             int arr[]=new int[size];
             
             for(int j=0;j<size;j++)
                arr[j]=scan.nextInt();
            int ksize=scan.nextInt();
             int m=0,n=0;
             for(int j=0;j<size;j=j+ksize)
             {
                 m=j;
                 
                 n=Math.min(m+ksize-1,size-1);
                 while(m<n)
                 {
                    int temp=arr[m];
                    arr[m]=arr[n];
                    arr[n]=temp;
                    m++;
                    n--;
                 }
                 
             }
             for(int j=0;j<size;j++)
                System.out.print(arr[j]+" ");
             System.out.println();
         }
     }
	
}

