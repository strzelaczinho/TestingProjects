/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SORTOWANIE_NA_ZMIANE;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author adam
 */
class GFG123 {
	public static void main (String[] args) {
			 Scanner scan=new Scanner(System.in);
	    int t=scan.nextInt();
	    while(t!=0)
	    {
	        String str=scan.next();
	       ArrayList<Character> upperCaseList=new ArrayList<Character>();
	       ArrayList<Character> lowerCaseList=new ArrayList<Character>();
	        int size=str.length();
	        for(int i=0;i<size;i++)
	        {
               if(str.charAt(i)>=65 && str.charAt(i)<=90)
               upperCaseList.add(str.charAt(i));
               else
               lowerCaseList.add(str.charAt(i));
	        }
	        Collections.sort(upperCaseList);
	        Collections.sort(lowerCaseList);
	        StringBuilder stringBuilder=new StringBuilder();
	        
	        int bigSize=upperCaseList.size()>lowerCaseList.size()?upperCaseList.size():lowerCaseList.size();
	        int smallSize=upperCaseList.size()<lowerCaseList.size()?upperCaseList.size():lowerCaseList.size();
	        
	        for(int i=0;i<smallSize;i++)
	        {
	            stringBuilder.append(upperCaseList.get(i));
	            stringBuilder.append(lowerCaseList.get(i));
	        }
	        if(upperCaseList.size()>lowerCaseList.size())
	        {
	            for(int i=smallSize;i<bigSize;i++)
	              stringBuilder.append(upperCaseList.get(i));
	        }else
	        {
	            for(int i=smallSize;i<bigSize;i++)
	              stringBuilder.append(lowerCaseList.get(i));
	        }
	        System.out.println(stringBuilder.toString());
	        
		t--;
		}
	}
}