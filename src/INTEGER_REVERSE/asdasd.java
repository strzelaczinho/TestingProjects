/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package INTEGER_REVERSE;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author adam
 */
class GFG {
	public static void main (String[] args) 
        {
		Scanner sc = new Scanner(System.in);
		int testcase = Integer.parseInt(sc.nextLine());
		while(testcase-- > 0)
		{
                    String koncowy ="";
		    String liczba = sc.nextLine();
		    StringBuilder sb = new StringBuilder();
		    sb.append(liczba);
		    sb.reverse();
		    String wynik = sb.toString();
                    int i = 0;
                    while(i<wynik.length())
                    {
                    if (wynik.startsWith("0"))
                    {
                        wynik = wynik.replaceFirst("0", "");

                    }
                    ++i;
                    }
                    
                    System.out.println(wynik);
		}
	}
}