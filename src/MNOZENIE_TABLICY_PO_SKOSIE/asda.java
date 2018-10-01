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
public class asda {
    public static void main(String[]args)
    {
            Scanner sc = new Scanner(System.in);
            int liczba = sc.nextInt();
            while(liczba-- > 0)
            {
                int rozmiar = sc.nextInt();
                int[] tablica = new int[rozmiar];
                int[] tablica2 = new int[rozmiar];
                
                for (int i =0;i<tablica.length;i++)
                {
                    tablica[i] = sc.nextInt();
                }
                for (int j = 0;j<tablica2.length;j++)
                {
                    tablica2[j] = sc.nextInt();
                }
                int wynik = wynik(tablica,tablica2);
                System.out.println(wynik);
            }
    }
    
    static int wynik (int[] tablica1,int[] tablica2)
    {
        
        int suma = 0;
        int i,j;
        for (i=0,j = tablica2.length-1;i<tablica1.length;i++,j--)
        {
            suma += tablica1[i]*tablica2[j];
        
        }
        return suma;
    }
}
