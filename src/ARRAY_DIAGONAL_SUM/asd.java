
package ARRAY_DIAGONAL_SUM;

import java.util.Scanner;

class asd 
{
    public static void main (String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        while(testcase-- > 0)
        {
            int rozmiar = sc.nextInt();
            int[][] tablica = new int[rozmiar][rozmiar];
            
            int suma1 = 0;
            int suma2 = 0;
            
            for (int i = 0;i<rozmiar;i++)
            for (int j = 0;j<rozmiar;j++)
                tablica[i][j] = sc.nextInt();
            
            for (int i = 0;i<rozmiar;i++)
            {
                for (int j = 0;j<rozmiar;j++)
                {
                    if (i == j)
                    {
                        suma1 += tablica[i][j];
                    }
                    if (i+j == (rozmiar-1))
                    {
                        suma2 += tablica[i][j];
                    }
                }
            }
            System.out.println(suma1+suma2);
        }
    }
}


