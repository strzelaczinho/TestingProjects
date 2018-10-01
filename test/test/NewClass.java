/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author adam
 */
public class NewClass {
    public static void main(String[] args) {
        String siema = "siemandRO";
        char[] tablica = siema.toCharArray();
        Set<String> adam = new HashSet();
        
        
        for (int i = 0;i<tablica.length;i++)
        {
           adam.add(String.valueOf(siema.charAt(i)));
        }
        if (siema.length() == adam.size())
                {
                    System.out.println("brak duplikatow");
                }
        else
        {
            System.out.println("Sa duplikaty");
        }
    }
 
}
