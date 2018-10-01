/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package COUNT_UPPERCASE_CHARACTERS;

import java.util.Scanner;

/**
 *
 * @author adam
 */
public class adamski {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int liczba = sc.nextInt();
        while (liczba -- > 0)
        {
        String nazwa = sc.next();
        char[] tablica = nazwa.toCharArray();
        int liczenie = 0;
        for (int i = 0;i<tablica.length;i++)
        {
            if (tablica[i] >= 'A' && tablica[i] <= 'Z')
     //     if(Character.isUpperCase(nazwa.charAt(i)))
            {
                liczenie++;
            }
        }
        System.out.println(liczenie);
        
        
        
        }
    }
}
