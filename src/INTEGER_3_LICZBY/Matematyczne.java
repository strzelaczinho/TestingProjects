/*
a + b + c = N.
ile jest rozwiązan
 */
package INTEGER_3_LICZBY;

import java.util.Scanner;

/**
 *
 * @author adam
 */
class Matematyczne {
	public static void main (String[] args) {
		//code
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t>0){
		    int n=s.nextInt();
		    int ans= (n+2)*(n+1)/2;
		    System.out.println(ans);
		    
		    
		    t--;
		}
	}
}
