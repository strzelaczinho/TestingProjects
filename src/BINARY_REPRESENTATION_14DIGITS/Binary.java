/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BINARY_REPRESENTATION_14DIGITS;

import java.util.Scanner;

/**
 *
 * @author adam
 */
public class Binary {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int liczba = sc.nextInt();
        
       while(liczba-- > 0)
      {
      int zamiana = sc.nextInt();
     
      
      
      String s2 = String.format("%14s", Integer.toBinaryString(zamiana)).replace(" ", "0");
      System.out.println(s2);    
           
      }
    }
    
}
// System.out.println("Binary is " + Integer.toBinaryString(zamiana));
// System.out.println("Number of one bits = " + Integer.bitCount(zamiana)); 
// Zamieni inta na binary oraz policzy ilosc 1 