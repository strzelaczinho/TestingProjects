/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ARRAY_BRAK_PARY;

import java.util.*;
import java.lang.*;
import java.io.*;
class Test
 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T!=0){
			int n=sc.nextInt();
		    int a[]=new int[n];
		    Map<Integer, Integer> m=new HashMap<>();
		    for (int i = 0; i < n; i++) {
				a[i]=sc.nextInt();
			}
			for (int i = 0; i < n; i++) {
				if(!m.containsKey(a[i])){
					m.put(a[i], 1);
				}else{
					m.put(a[i], m.get(a[i])+1);
				}
			}
			SortedSet<Integer> keys=new TreeSet<>(m.keySet());
		    for (Integer i: keys) {
				if(m.get(i)%2!=0){
					System.out.print(i+" ");
				}
			}
		    System.out.println();
			T--;
		}
	}
}

/*

In a party everyone is in couple except one. People who are in couple have same numbers. Find out the person who is not in couple.

Input:
The first line contains an integer 'T' denoting the total number of test cases. In each test cases, the first line contains an integer 'N' denoting the size of array. The second line contains N space-separated integers A1, A2, ..., AN denoting the elements of the array. (N is always odd)


Output:
In each seperate line print number of the person not in couple.


Constraints:
1<=T<=30
1<=N<=500
1<=A[i]<=500
N%2==1


Example:
Input:
1
5
1 2 3 2 1

Output:
3s
*/