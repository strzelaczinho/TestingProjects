/*
//given left rectangle: l1(x1,y1) r1(x2,y2) => All 4 corners ==> (x1,y1),(x1,y2),(x2,y2),(x2,y1)
//given right rectangle: l2(x3,y3) r2(x4,y4) => All 4 corners ==> (x3,y3),(x3,y4),(x4,y4),(x4,y3)

//overlap =>(x3,y3) is in the area of the left rectangle
 */
package OVERLAPPING_RECTANGLES;

import java.util.Scanner;

/**
 *
 * @author adam
 */
class GFG {
    public static boolean overlappingRect(int[] r1, int[] r2){
        boolean result;
        if(r1[0]>r2[2] || r1[2]<r2[0]){   // x1>a2 || x2<a1
            result = false;
    	    System.out.println("0");
        }
    	else if(r1[3]>r2[1] || r1[1]<r2[3]){    // y2>b1 || y1<b2
    	    result = false;
    	    System.out.println("0");
    	}
    	else{ 
    	    result = true;
    	    System.out.println("1");
    	}
    	return result;
    }
    
	public static void main (String[] args) {
		//code
		Scanner sc=new Scanner(System.in);
    	int t=sc.nextInt();

    	while(t-- > 0){
    	    int[] r1 = new int[4];
    	    int[] r2 = new int[4];
    	    r1[0]=sc.nextInt(); //x1
    	    r1[1]=sc.nextInt(); //y1
    	    r1[2]=sc.nextInt(); //x2
    	    r1[3]=sc.nextInt(); //y2
    	    r2[0]=sc.nextInt(); //a1
    	    r2[1]=sc.nextInt(); //b1
    	    r2[2]=sc.nextInt(); //a2
    	    r2[3]=sc.nextInt(); //b2
    	    overlappingRect(r1, r2);
    	}
	}
}