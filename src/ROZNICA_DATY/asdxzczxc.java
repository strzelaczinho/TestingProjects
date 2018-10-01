/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ROZNICA_DATY;

import java.util.Calendar;
import java.util.*;
import java.lang.*;
import java.io.*;
class Date
{
    int d,m,y;
    public Date(int d,int m,int y)
    {
        this.d=d;
        this.m=m;
        this.y=y;
    }
    int dayinmonth(int i)
    {
        if(i==1||i==3||i==5||i==7||i==8||i==10||i==12)
            return 31;
        else if(i==2)
            return 28;
        else
        return 30;
    }
    int checkleap()
    {
        if(m<=2)
        y--;
    return y/4-y/100+y/400;     
    }
    public long days()
    {
        int d1=y*365+d;
        for(int i=1;i<m;i++)
            d1+=dayinmonth(i);
        d1+=checkleap();
        return d1;
    }
}

class GFG {
	public static void main (String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		  int t=sc.nextInt();
		   while(t-->0)
		   {
		       int d,m,y;
		       d=sc.nextInt();
		       m=sc.nextInt();
		       y=sc.nextInt();
		       Date first=new Date(d,m,y);
		       d=sc.nextInt();
		       m=sc.nextInt();
		       y=sc.nextInt();
		       Date second=new Date(d,m,y);
		       System.out.println(Math.abs(second.days()-first.days()));
		   }
	}
}