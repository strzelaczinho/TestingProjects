/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package INTEGER_REVERSE;

import java.util.Scanner;

/**
 *
 * @author adam
 */
class cxz
 {
	public static void main (String[] args)
	 {
	 Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++){
		    char[] c=sc.next().toCharArray();
		    int low=0,high=c.length-1;
		    while(low<high){
		        char temp=c[low];
		        c[low]=c[high];
		        c[high]=temp;
		        low++;
		        high--;
		    }
		    boolean flag=false;
		    for(int j=0;j<c.length;j++){
		        if(c[j]!='0')flag=true;
		        if(flag)System.out.print(c[j]);
		    }
		    System.out.println();
		}
	 }
}