/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SORTOWANIE_NA_ZMIANE;

import java.util.Arrays;
import java.util.Scanner;

public class asdasd {
    public static void main (String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int liczba = sc.nextInt();
        while(liczba--> 0)
        {
            String nowy = sc.next();
            String male="";
            String duze="";
            for (int i = 0;i<nowy.length();i++)
            {
                if(Character.isUpperCase(nowy.charAt(i)))
                {
                    duze += nowy.charAt(i);
                }
                else  
                {
                    male += nowy.charAt(i);
                }
            }
            char a[] = male.toCharArray();
            char b[] = duze.toCharArray();
            Arrays.sort(a);
            Arrays.sort(b);
            int i = 0, j = 0;
            
            while(i <a.length && j<b.length)
            {
                System.out.print(""+b[i++]+a[j++]);
            }
            while (i< a.length)
            {
                System.out.print(""+a[i++]);
            }
            while(j<b.length)
            {
                System.out.print(""+b[j++]);
            }
            System.out.println("");
            
        }
    }
    
}
