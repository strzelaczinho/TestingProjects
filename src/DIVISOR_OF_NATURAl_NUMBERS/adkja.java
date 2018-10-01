/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DIVISOR_OF_NATURAl_NUMBERS;

import java.util.Scanner;

/**
 *
 * @author adam
 */
public class adkja {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        while(testcase-- >0)
        {
            double liczba = sc.nextInt();
            podziel(liczba);
            System.out.println();
        }
    }
    public static void podziel(double n )
    {
        for (int i = 1;i<=n;i++)
        {
            if ((n % i)== 0)
            {
                System.out.print(i+" ");
            }
        }
    }
}
