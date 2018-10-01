/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BINARY_LOOKING_FOR_1;

import BINARY_REPRESENTATION_14DIGITS.*;
import java.util.Arrays;
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
      String s2 =  Integer.toBinaryString(zamiana);
      
      if (Integer.bitCount(zamiana) == 1 ) 
      {
           System.out.println(s2.length()-s2.indexOf('1'));
         
      }
      else 
      {
          
          System.out.println(-1);
      }
      
      
    }
    
}
}
// System.out.println("Binary is " + Integer.toBinaryString(zamiana));
// System.out.println("Number of one bits = " + Integer.bitCount(zamiana)); 
// Zamieni inta na binary oraz policzy ilosc 1 