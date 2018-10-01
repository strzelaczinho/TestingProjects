/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DIVISORS;

import java.util.Scanner;

/**
 *
 * @author adam
 */
public class divisors2 {
 public static void main(String args[]){
        
        Scanner in = new Scanner(System.in);
        
        int t = in.nextInt();
        for(int a = 0; a < t; a++){
            int n = in.nextInt();
            int count = 0;
            for(int i = 1; i <= n; i++){
                if(n % i == 0 && i % 3 == 0){
                    count++;
                }
            }
            System.out.println(count);
        }
        
        
    }
}
