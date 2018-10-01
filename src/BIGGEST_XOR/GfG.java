/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BIGGEST_XOR;

import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author adam
 */
public class GfG
{
              public static int maxSubarrayXOR(int set[], int n)
                {
                     //add code here.
                     Set<Integer> al = new TreeSet<Integer>();
                     Set<Integer> temp;
                     al.add(set[0]);
                     int max = set[0];
                     for(int i = 1;i<n;i++){
                         temp = new TreeSet<Integer>(al);
                         for(Integer val : al){
                             int t = val^set[i];
                             if(t > max)
                                max = t;
                            temp.add(t);
                         }
                         temp.add(set[i]);
                         if(set[i] > max)
                                max = set[i];
                        
                         al = new TreeSet<Integer>(temp);
                     }
                     return max;
                }
}
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