/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MNOZENIE_TABLICY_PO_SKOSIE;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author adam
 */
class GFG {
	public static void main (String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int T = s.nextInt();
            while (T-- > 0) {
                int N = s.nextInt();
                int[] A = new int[N];
                for (int i = 0; i < N; i++)
                    A[i] = s.nextInt();

                int[] B = new int[N];
                for (int i = 0; i < N; i++)
                    B[i] = s.nextInt();

                Arrays.sort(A);
                Arrays.sort(B);
                long ans = 0;
                for (int i = 0; i < N; i++)
                    ans += A[i]*B[i];
                System.out.println(ans);
            }
        }
	}
}