/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BIGGEST_XOR;

/**
 *
 * @author adam
 */

import java.util.*;
class XOR
{	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0)
		{
		  int n = sc.nextInt();
		  int[] a = new int[10004];
			for(int i=0;i<n;i++)
				a[i]=sc.nextInt();
		  GfG1 g = new GfG1();
		  System.out.println(g.maxSubarrayXOR(a , n));
		}
	}
}


/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

/*Complete the function below*/
class GfG1{
    public static int maxSubarrayXOR(int set[], int n){
        int index = 0;
        for(int i=31;i>=0;i--){
            int maxEle = -1;
            int maxIdx = -1;
            for(int j=index;j<n;j++){
                if( ((set[j] & (1<<(i))) != 0)  && set[j] > maxEle){
                    maxEle = set[j];
                    maxIdx = j;
                }
            }
            
            if(maxEle == -1)
                continue;
            swap(set, index, maxIdx);
            for(int j=0;j<n;j++){
                if(j==index)
                    continue;
                if( (set[j]&(1<<(i))) != 0)
                    set[j]^=maxEle;
            }
            index++;
        }
        int rv=0;
        for(int i=0;i<n;i++){rv^=set[i];}
        return rv;
    }
    

    static void swap(int[] ar, int a, int b){
        int temp = ar[a];
        ar[a] = ar[b];
    }}


/*
Given a set of positive integers. The task is to complete the function  maxSubarrayXOR which returns an integer denoting the maximum XOR subset value in the given set. 

Examples:

Input: set[] = {2, 4, 5}
Output: 7
The subset {2, 5} has maximum XOR value

Input: set[] = {9, 8, 5}
Output: 13
The subset {8, 5} has maximum XOR value


Input:
The first line of input contains an integer T denoting the no of test cases. Then T test cases follow. Each test case contains two lines. The first line of input contains an integer N denoting the size of the array A[]. Then in the next line are N space separated values of the array.

Output:
For each test case in a new line output will be the maximum XOR subset value in the given set.

Constraints:
1<=T<=100
1<=N<=50

Example(To be used only for expected output):
Input:
2
3
2 4 5
3
9 8 5
Output:
7
13
*/