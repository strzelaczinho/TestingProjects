/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SORTOWANIE_NA_ZMIANE;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author adam
 */
class GFG {
	public static void main (String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int testCases = sc.nextInt();
	    while(testCases>0){
	        String a = sc.next();
	        char arr[] = a.toCharArray();
	        int length = arr.length;
	        List<String> array1 = new ArrayList<String>();
	        List<String> array2 = new ArrayList<String>();
	        for(char i: arr){
	            if((int)i>64 && (int)i<91){
	                array1.add(String.valueOf(i));
	            } else {
	                array2.add(String.valueOf(i));
	            }
	        }
	        int big = (array1.size()>array2.size())?array1.size():array2.size();
	        int small = (array1.size()<array2.size())?array1.size():array2.size();
	        int flag = 0;
	        if(array1.size()>array2.size()){
	            flag = 1;
	        }
	        Collections.sort(array1);
	        Collections.sort(array2);
	        String out = "";
	        for(int i=0; i<small; i++){
	                out += array1.get(i);
	                out += array2.get(i);
	        }
	        if(flag==1){
	            for(int i=small; i<big; i++){
	                out +=array1.get(i);
	            }
	        } else {
	            for(int i= small; i<big; i++){
	                out+= array2.get(i);
	            }
	        }
	        System.out.println(out);
	        testCases--;
	    }
	 }
}