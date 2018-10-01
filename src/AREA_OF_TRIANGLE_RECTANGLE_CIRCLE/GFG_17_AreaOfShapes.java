/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AREA_OF_TRIANGLE_RECTANGLE_CIRCLE;

import java.util.Scanner;

public class GFG_17_AreaOfShapes {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int tc = sc.nextInt();

		while (tc-- > 0) {
		
			//Rectangle - length, breadth / Triangle - base, perpendicular / Circle - radius
			int r_length = sc.nextInt();
			int r_breadth = sc.nextInt();
			int t_base = sc.nextInt();
			int t_perp = sc.nextInt();
			int c_rad = sc.nextInt();
			
			System.out.printf("%d %d %d",area_of_rect(r_length, r_breadth), 
					area_of_triangle(t_base,t_perp),area_of_circle(c_rad));
			
			if (tc > 0)
				System.out.println();
		}
	}
	
	//rectangle
	static int area_of_rect(int r_length, int r_breadth){
		
		double area = r_length*r_breadth;
		
		return (int)Math.floor(area);
	}
	
	//right angled triangle
	static int area_of_triangle(int base, int perp){
		
		double area = (0.5)*base*perp;
		return (int)Math.floor(area);
	}
	
	//circle
	static int area_of_circle(int rad){
		
		double pi = 3.14;
		double area = (pi)*Math.pow(rad,2);

		return (int)Math.floor(area);
	}
}