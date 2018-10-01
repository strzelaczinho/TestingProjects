/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package INTEGER_REVERSE;

/**
 *
 * @author adam
 */
import java.util.*;
import java.lang.*;
import java.io.*;

class zxc {
	public static void main (String[] args) {
		//code
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t-->0){
		    int number = s.nextInt();
		    zxc nr = new zxc();
		    System.out.println(nr.reverseN(number));
		}
	}
	public int reverseN(int number){
	    int reverse=0;
	    while(number!=0){
	        reverse = (reverse*10)+(number%10);
	        number=number/10;
	    }
	    return reverse;
	}
}
