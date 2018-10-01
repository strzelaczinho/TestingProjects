/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package STUDENTS_SCORE;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author adam
 */
class GFG {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
	    int num = sc.nextInt();
	    while(num-- > 0){
	        int n = sc.nextInt();
	        int max = Integer.MIN_VALUE;
	        List<String> students = new ArrayList<>();
	        for(int i = 0; i < n; i++){
	            String str = sc.next();
	            int[] arr = new int[3];
	            int avg = 0;
	            for(int j = 0; j < 3; j++)
                    avg+= sc.nextInt();
	            avg /= 3;
	            if(avg > max){
	                max = avg;
	                students = new ArrayList<>();
	                students.add(str);
	            }
	            else if(avg == max){
	                students.add(str);
	            }
	        }
	        for(String str : students){
	            System.out.print (str + " ");
	        }
	        System.out.println(max);
	    }
    }
}