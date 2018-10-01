/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PARTY;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import static javafx.scene.input.KeyCode.A;

/**
 *
 * @author adam
 */
public class adamski {
    public static void main (String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        while(testcase--> 0)
        {
            Set<Integer> acz = new HashSet<>();
            
            
            int liczbaOsob = sc.nextInt();
            
            for (int i = 0;i<liczbaOsob;i++)
            {
                acz.add(sc.nextInt());
            }
           
            if ( acz.size() == liczbaOsob)
            {
                System.out.println("GIRLS");
                
            }
            else {
                System.out.println("BOYS");
            }
            
        }
    }
}
