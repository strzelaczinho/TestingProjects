/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package REMOVE_STRING_SPACES;

import java.util.Scanner;

/**
 *
 * @author adam
 */
class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = Integer.parseInt(sc.nextLine());
		while(testcase-- > 0)
		{
		    String nazwa = sc.nextLine();
                    String nazwa2 = nazwa.replace(" ", "");
		    System.out.println(nazwa2);
                    
                    String nazwa3 = sc.nextLine();
                    System.out.println(removeAllWhitespace(nazwa3));
		}
	}
          public static String removeAllWhitespace(String value) {
        // Remove all whitespace characters.
        return value.replaceAll("\\s", "");
    }
}