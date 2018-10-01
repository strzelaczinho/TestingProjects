/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TIDY_NUMBER;

import java.util.Scanner;

/**
 *
 * @author adam
 */
public class asd {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        while(testcase-- > 0)
        {
            int liczba = sc.nextInt();
            String zamiana = String.valueOf(liczba);
            char[] chars = zamiana.toCharArray();
            int[] tablica = new int[chars.length];
            
            for (int i = 0;i<tablica.length;i++)
            {
                tablica[i] = Character.getNumericValue(chars[i]);
            }
            int z = 0;
            if (tablica.length == 1)
            {
                z = 1;
            }
            for (int j = 0;j<tablica.length-1;j++)
            {
                
                if (tablica[j+1] >= tablica[j] )
                        {
                            z = 1;
                        }
                else {
                    z = 0;
                    break;
                     }
               
            }
           
            System.out.println(z);
            
        }
    }
}
