
package INTEGER_PATTERN;

import java.util.Scanner;


public class GFG_35_NumberPattern {
	public static void main(String args[])
        {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		while (tc-- > 0) {
			//enter num
			int n = sc.nextInt();
			//print pattern n times
			for(int i = 1;i<=n;i++){
				pattern(i);
				//add spaces between
				if(i<n)
					System.out.print(" ");
			}
			if (tc > 0)
				System.out.println();
		}
	}
	
	static void pattern(int n)
        {
		if(n == 1)
                {
			System.out.print(n);
		}
                else
                {
			//increasing order
			for(int i=1;i<n;i++)
                        {
				System.out.print(i);
			}
			//decreasing order
			for(int i=n;i>=1;i--)
                        {
				System.out.print(i);
			}
		}
	}
}