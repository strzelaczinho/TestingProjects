/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PATTERN_OF_STRINGS;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author adam
 */
public class asd {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int liczba = sc.nextInt();
        while(liczba-- > 0)
        {
            String nazwa = sc.next();
            char[] a = nazwa.toCharArray();
            ArrayList<String> acz = new ArrayList<>();
            for (int i = 0;i<nazwa.length();i++)
            {
                acz.add(String.valueOf(a[i]));
            }
            for ( int i = acz.size()-1;i>=0;i--)
            {
                for (int j = 0;j<acz.size();j++)
                {
                    System.out.print(acz.get(j));
                }
                if (acz.size() == 0)
                {
                    break;
                }
                System.out.println();
                acz.remove(i);
                
            }
            
        }
    }
}
