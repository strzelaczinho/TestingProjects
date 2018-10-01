/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MISSING_NUMBERS;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author adam
 */
public class asdas {
    public static void main(String[]args)
    {
        final long start = System.nanoTime();
        Scanner sc = new Scanner(System.in);
        int liczba = sc.nextInt();
        
        while(liczba-- > 0)
        {
               
                int num = sc.nextInt();
                long sum = num * (num + 1) ; // sprawdza  sumę  n(n+1) / 2  np dla n =4 = 1+2+3+4
                sum = sum / 2 ;
                
                for(int j = 0 ; j < num - 1 ; j++ )
                {
                    sum = sum - sc.nextInt();
                }
                
                System.out.println(sum) ; 
                final long end = System.nanoTime();
                System.out.println("Took: " + ((end - start) / 1000000) + "ms");
        }
    }
}
