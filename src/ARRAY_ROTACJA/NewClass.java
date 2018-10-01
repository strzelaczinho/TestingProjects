/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ARRAY_ROTACJA;

import java.util.Scanner;

/**
 *
 * @author adam
 */
public class NewClass {
    public static void main (String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        while(testcase-- > 0)
        {
            int rozmiar = sc.nextInt();
            int[] tablica = new int[rozmiar];
            for (int i = 0;i<rozmiar;i++)
            {
                tablica[i] = sc.nextInt();
            }
            int rotate = sc.nextInt();
            rotate = (rotate % rozmiar)-1;
            for (int j = 0;j<rozmiar;j++)
            {
                int zamiana = tablica[rotate-1];
                tablica[j] = zamiana;
                zamiana = tablica[j];
            }
                
        }
    }
}
