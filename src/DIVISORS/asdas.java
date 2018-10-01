/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DIVISORS;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author adam
 */
public class asdas {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int liczba = sc.nextInt();
        while(liczba-- > 0)
        {
               int pierwsza = sc.nextInt();
               int druga = sc.nextInt();
               
               ArrayList<Integer> acz = new ArrayList<>();
               ArrayList<Integer> acz2 = new ArrayList<>();
               int i = 1;
               while (i<= pierwsza)
               {
                   if (pierwsza % i == 0 && (druga % i == 0))
                   {
                       acz.add(i);
                   }
                  i++;
               }
               System.out.println(acz.size());
        }
    }
}
