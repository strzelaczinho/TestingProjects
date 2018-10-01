package ARRAY_ROTACJA;

import java.util.Scanner;


class GFG3 {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		int arr[];
		for(int i=0;i<t;i++){
		    int n=sc.nextInt();
		    arr=new int[n];
		    for(int j=0;j<n;j++)
		        arr[j]=sc.nextInt();
		    int d=sc.nextInt();
		    rotate(arr,d,n);
		    print(arr);
		}
	}
	public static void rotate(int[] arr, int d, int n){
	    reverse(arr,0,d-1);
	    reverse(arr,d,n-1);
	    reverse(arr,0,n-1);
	}
	public static void reverse(int[] arr, int start, int end){
	    while(start<end)
            {
	        int temp=arr[start];
	        arr[start]=arr[end];
	        arr[end]=temp;
	        start++;
	        end--;
	    }
	}
	public static void print(int[] arr){
	    for(int i=0;i<arr.length;i++)
	        System.out.print(arr[i]+" ");
	    System.out.println();
	}
}