/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MULTIPLAYNG_ARRAY;

/**
 *
 * @author adam
 */
import java.util.*;
import java.lang.*;
import java.io.*;

import java.util.*;
import java.lang.*;
import java.io.*;

class ARRAY_WITH_MULTIPLAYING {
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testcase = Integer.parseInt(br.readLine());
		
		while(testcase-- > 0)
		{
		    int num = Integer.parseInt(br.readLine());
		    
		    for (int i = 1;i<=10;i++)
		    {
		        System.out.print(i*num+" ");
		    }
		    System.out.println();
		}
	}
}