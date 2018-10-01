/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ROZNICA_DATY;

/**
 *
 * @author adam
 */
import java.util.*;
import java.lang.*;
import java.io.*;
//import java.lang.Math;
import java.text.SimpleDateFormat;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

class Date{
    int d,m,y;
    
    Date(int d, int m, int y){
        this.d=d;
        this.m=m;
        this.y=y;
    }
        int dayInMonth(int i){
            if(i==1||i==3||i==5||i==7||i==8||i==10||i==12)
            return 31;
        else if(i==2)
            return 28;
        else
        return 30;
        }
        
        int checkLeap()
        {
            if(m<=2)
            y--;
        return y/4-y/100+y/400;     
        }
        
        long noOfDays(){
            int d1=y*365+d;
            
            for(int i=1;i<m;i++){
                d1+=dayInMonth(i);
            }
            d1+=checkLeap();
            return d1;
        }
    }
    
class asdasd {
	public static void main (String[] args) throws Exception {
		//code
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for(int i=1;i<=t;i++){
		    
		    String temp1[] = br.readLine().split(" ");
		    int d1 = Integer.parseInt(temp1[0]);
		    int m1 = Integer.parseInt(temp1[1]);
		    int y1 = Integer.parseInt(temp1[2]);
		    
		    Date1 date1 = new Date1(d1,m1,y1);
		    
		    String temp2[] = br.readLine().split(" ");
		    int d2 = Integer.parseInt(temp2[0]);
		    int m2 = Integer.parseInt(temp2[1]);
		    int y2 = Integer.parseInt(temp2[2]);
		    
		    Date date2 = new Date(d2,m2,y2);
		    
		    System.out.println(Math.abs(date2.noOfDays()-date1.noOfDays()));
		}
	}
}