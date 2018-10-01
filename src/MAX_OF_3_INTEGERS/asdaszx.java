/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MAX_OF_3_INTEGERS;

/**
 *
 * @author adam
 */
import java.util.*;
import java.lang.*;

class GFG {
	public static void main (String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int liczba = sc.nextInt();
	    while(liczba-- > 0)
	    {
	        
	        ArrayList<Integer> acz = new ArrayList<>();
                acz.add(sc.nextInt());acz.add(sc.nextInt());acz.add(sc.nextInt());
                Collections.sort(acz);
                System.out.println(acz.get(acz.size()-1));
	         
	    }
	}
}