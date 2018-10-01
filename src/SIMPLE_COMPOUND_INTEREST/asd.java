/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SIMPLE_COMPOUND_INTEREST;

import java.util.Scanner;

/**
 *
 * @author adam
 */
public class asd {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      double principal = 0;
      double rate = 0;
      double time = 0;
      double compoundInterest = 0;  
      int testcase = input.nextInt();
      while(testcase-- > 0)
      {
      //System.out.print("Enter the Principal amount : "); 
      principal = input.nextDouble();
      //System.out.print("Enter the Rate : "); 
      rate = input.nextDouble();
     // System.out.print("Enter the Time : "); 
      time = input.nextDouble();
 
      compoundInterest = principal * Math.pow((1 + rate/100),time); 
      
      
      System.out.println((int)compoundInterest);
      }
   
   }
}
