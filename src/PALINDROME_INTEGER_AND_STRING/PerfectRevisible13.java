/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PALINDROME_INTEGER_AND_STRING;

import java.util.Scanner;

/**
 *
 * @author adam
 */
public class PerfectRevisible13 {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			String s=sc.next();int ch=0;
			for(int i=0,j=s.length()-1;i<s.length()/2;i++,j--){
				if(s.charAt(i)==s.charAt(j))
                                {
				// nie rob nic 	
				}
                                else
				{
					ch=1;
					break;
				}
			}
			if(ch==0){
				System.out.println(1);
			}else
				System.out.println(0);
		}
	}

}

