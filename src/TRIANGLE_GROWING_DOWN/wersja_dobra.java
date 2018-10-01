package TRIANGLE_GROWING_DOWN;

import java.util.Scanner;
public class wersja_dobra {
   	public static void main (String[] args)
        {
	   Scanner sc=new Scanner(System.in);
	   int t=sc.nextInt();
	   while(t-->0)
           {
	       String s1=sc.next();
	       String s2="";
	       for(int i=0;i<s1.length()-1;i++)
	       s2+=".";
	       String s3=s2+s1;
	       int l=0;
               
               
	       for(int p=s1.length();p<s3.length()+1;p++)
               {
	           System.out.println(s3.substring(l++,p));
               }
           }
        }
}
