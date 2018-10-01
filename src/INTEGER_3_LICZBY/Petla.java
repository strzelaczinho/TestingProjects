
package INTEGER_3_LICZBY;

import java.util.Scanner;

/**
a + b + c = N.
ile jest rozwiązan
 */
class GFG
{
	public static void print(String str)
	{
		System.out.print(""+str);
	}
	public static void println(String str)
	{
		System.out.println(""+str);
	}
	public static void main (String[] args)
	{
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(--t>=0)
		{
			int n=s.nextInt();
			int count=0;
			for(int i=0;i<=n;i++)
			{
			    for(int j=0;j<=n;j++)
			    {
			        if(i+j<=n)
			        {
			            count++;
			        }
			    }
			}
			println(""+count);
		}
	}
}