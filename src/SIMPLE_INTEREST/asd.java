/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SIMPLE_INTEREST;

import java.util.Scanner;

/**
 *
 * @author adam
 */
public class asd {
    public static void main(String[]args)
    {
         float p, r, t;
        Scanner s = new Scanner(System.in);
        int testcase = s.nextInt();
        while(testcase-- > 0)
        {
       // System.out.print("Enter the Principal : ");
        p = s.nextFloat();
       // System.out.print("Enter the Rate of interest : ");
        r = s.nextFloat();
       // System.out.print("Enter the Time period : ");
        t = s.nextFloat();
        float si;
        si = (r * t * p) / 100;
        System.out.print((int)si);
        }
    }
}
