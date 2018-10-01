/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TWO_LARGE_NUMBERS;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author adam
 */
public class asda {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        while(testcase-- > 0)
        {
            BigInteger liczba = new BigInteger(sc.next());
            BigInteger liczba2 = new BigInteger(sc.next());
            if (liczba.compareTo(liczba2) == 0)
            {
                System.out.println(3);
            }
            else if (liczba.compareTo(liczba2) == -1 )
            {
                System.out.println(1);
                //-1, 0 or 1 as this BigInteger is numerically less than, equal to, or greater than val
            }
            else {
                System.out.println(2);
            }
        }
    }
}
