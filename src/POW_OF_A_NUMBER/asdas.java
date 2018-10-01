/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POW_OF_A_NUMBER;

import java.util.Scanner;

/**
 *
 * @author adam
 */
class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		while(testcase-- > 0)
		{
		    int potega = sc.nextInt();
                    int liczba = sc.nextInt();
		    int z = sprawdz(potega, liczba);
                    System.out.println(z);
		}
	}
        static int sprawdz(int potega,int liczba)
        {
            int zwroc=0;
            for (int i =0;i<liczba;i++)
            {
                    if (Math.pow(potega,i) == liczba)
                    {
                        zwroc = 1;
                        break;
                   
                    }
            }
            return zwroc;
        }
}
