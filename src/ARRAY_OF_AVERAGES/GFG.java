/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ARRAY_OF_AVERAGES;

import java.util.Scanner;

/**
 *
 * @author adam
 */
public class GFG {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int liczba = sc.nextInt();
        
        while(liczba -- > 0)
        {
            int suma = 0;
            int [] tablica = new int[sc.nextInt()];
            for (int i = 0;i< tablica.length;i++)
            {
                tablica[i] = sc.nextInt();
            }
            for (int i = 0;i<tablica.length;i++)
            {
                suma = podziel(i,tablica);
                 System.out.print(suma+" ");
            }
            if (liczba > 0)
            {
                System.out.println();
            }
           
            
        }
        
    }
    static int podziel(int i,int[] tablica)
    {
        int suma = 0;
        int j;
        for (j = 0;j<=i;j++)
        {
            if (i == 0)
            {
                return tablica[0];
            }
            else 
            {
                suma += tablica[j];
            }
        }
                
        return suma/j;
    }
}
