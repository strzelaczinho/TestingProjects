/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package STUDENTS_SCORE;

import java.util.Scanner;

/**
 *
 * @author adam
 */
class GFG2 {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		Integer t=sc.nextInt();
		while(t>0){
		    Integer liczba =sc.nextInt();           // ilosc wpisow
		    String[] name =new String[liczba];      // imiona
		    Integer[] marks = new Integer[liczba];  // srednie
		    for(Integer i=0;i<liczba;i++){
		        name[i] = sc.next();
		        Integer m1 = sc.nextInt();
		        Integer m2 = sc.nextInt();
		        Integer m3 = sc.nextInt();
		        marks[i] = (m1+m2+m3)/3;
		    }
		    
		    Integer max = 0;
		    Integer index = 0;
		    for(Integer i=0;i<liczba;i++){
		        if(marks[i]>max){
		            max = marks[i];
		            index = i;
		        }
		    }
                    for(Integer i=0;i<liczba;i++){
		        if(marks[i]==max){
		            System.out.print(name[i]+" ");
		        }
		    }
		    System.out.println(marks[index]);
		    t--;
		    
		}
	}
}
