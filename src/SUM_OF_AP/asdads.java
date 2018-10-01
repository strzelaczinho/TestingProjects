/*
arithmetic progression
 */
package SUM_OF_AP;

import java.util.Scanner;

/**
 *
 * @author adam
 */
public class asdads {
    
    
public static void main (String[] args) 
                {
		Scanner in = new Scanner(System.in);
		
		for (int i = in.nextInt(); i > 0; i--)
		{
		    int terms = in.nextInt();
		    int firstTerm = in.nextInt();
		    int difference = in.nextInt();
		    
		    System.out.println(terms * (firstTerm + (firstTerm + (terms - 1)*difference)) / 2);
		}
            }
    }


