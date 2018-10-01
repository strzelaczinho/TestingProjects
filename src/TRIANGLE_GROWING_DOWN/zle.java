
package TRIANGLE_GROWING_DOWN;

import java.util.ArrayList;
import java.util.Scanner;

/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG3{
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
          for (int j = acz.size()-1;j>=0;j--)
          {
              acz.set(j, ".");
              
          }
          int k = 0;
          for (int i = acz.size()-1;i>=0;i--)
          {
              acz.set(i, Character.toString(lista[k]));
              for (int j = acz.size()-1;j>=0;j--)
              {
                  System.out.print(acz.get(j));
              }
              System.out.println();
              k++;
          }
        
       }     

   }

 }


