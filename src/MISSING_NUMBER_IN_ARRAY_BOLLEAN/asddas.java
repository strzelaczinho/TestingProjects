/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MISSING_NUMBER_IN_ARRAY_BOLLEAN;

/**
 *
 * @author adam
 */
import java.util.*;
import java.lang.*;
import java.io.*;

class asddas {
	public static void main (String[] args) {
		 Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for (int i=0; i<test;i++){
            int n =sc.nextInt();
            int arr [] =new int[n];
            int p =sc.nextInt();
            for (int j=0;j<arr.length;j++){
                arr[j]=sc.nextInt();
            }
            boolean flag =false;
            for (int k=0;k<arr.length;k++){
                for (int l=k+1;l<arr.length;l++){
                    if (arr[k]*arr[l]==p){
                        flag =true;
                        break;
                    }
                }
            }
            if (flag){
                System.out.println("Yes");
            }
            else System.out.println("No");
        }
	}
}