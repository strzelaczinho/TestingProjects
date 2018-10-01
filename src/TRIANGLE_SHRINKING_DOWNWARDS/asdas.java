
package TRIANGLE_SHRINKING_DOWNWARDS;

import java.util.ArrayList;
import java.util.Scanner;

/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG{
   public static void main (String[] args) {
       Scanner sc = new Scanner(System.in);
       int testcase = sc.nextInt();
       
       while(testcase-- > 0)
       {
          String nazwa = sc.next();
          ArrayList<String> acz = new ArrayList<String>();              
          
          char[] lista = nazwa.toCharArray();
          for (int i = 0;i<lista.length;i++)
          {
              acz.add(Character.toString(lista[i]));
          }
       for (int i = 0;i<lista.length;i++)
       {
          for (int j = 0;j<lista.length;j++)
          {
              System.out.print(acz.get(j));
          }
          acz.set(i, ".");
          System.out.println();
          
       }
        
       }     

   }

 }


