/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PRINT_THE_LEFT_ELEMENT;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author adam
 */
public class asdasd {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int liczba = sc.nextInt();
        while(liczba-- > 0)
        {
            int liczba2 = sc.nextInt();
            ArrayList<Integer> acz = new ArrayList<>();
            for (int i = 0;i<liczba2;i++)
            {
                acz.add(sc.nextInt());
            }
            
            while(acz.size() > 1)
            {
               
            acz.remove(Collections.max(acz));
            if (acz.size() == 1)
            {
                break;
            }
            acz.remove(Collections.min(acz));
            }
            System.out.println(acz.get(0));
        }
    }
}
