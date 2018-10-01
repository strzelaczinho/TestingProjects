/*
geometric progression
 */
package SUM_OF_GP;

import java.util.Scanner;

/**
 *
 * @author adam
 */
public class asdasd {
  public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int tc = sc.nextInt();

		while (tc-- > 0) {
			// get n, a, r
			int n = sc.nextInt();
			double a = sc.nextDouble();
			double r = sc.nextDouble();

			double sum = 0;
			for (int i = 0; i < n; i++) {
                            
				if (i >= 1) {
                                    System.out.print("Liczba i to "+i+" Liczba zwykla to "+a+" * "+r+" = ");
					a *= r;
                                        System.out.print(a+" ");
                                        System.out.println();
                                        
				}
                                
				sum += a;
			}
// 3 + 6 + 12 . 
			System.out.printf("%.6f",sum);

			if (tc > 0)
				System.out.println();
		}
	}
}
