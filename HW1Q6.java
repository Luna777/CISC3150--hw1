// CISC 3150
// Xin Guan
// 9/2/2015

import java.util.*;

public class HW1Q6{
	
	public static void main(String[] args){
		
		double[][] center = new double[2][2];
		double r0, r1;
		double d; //distance between two centers
		double rdiff; //difference by two radiuses
		double rsum; // sum of two radiuses
		
		Scanner my_sc = new Scanner(System.in);
		
		//get the center coordinates and radiuses of two circles
		System.out.print("enter the coordinate of circle1's center(use space to separate them, ex:4.5 2.1): ");
		
		center[0][0]= my_sc.nextDouble();
		center[0][1]= my_sc.nextDouble();
		
		System.out.print("enter radius of circle1: ");
		
		r0= my_sc.nextDouble();
		
		System.out.print("enter the coordinate of circle2's center(use space to separate them, ex:4.5 2.1): ");
		
		center[0][0]= my_sc.nextDouble();
		center[0][1]= my_sc.nextDouble();
		
		System.out.print("enter radius of circle2: ");
		
		r1= my_sc.nextDouble();
		
		//System.out.println("r0="+r0);
		//System.out.println("r1="+r1);
		
		
		//get the distance, d, between two centers
		d=Math.sqrt(Math.pow((center[1][0]-center[0][0]),2) + Math.pow(center[1][1]-center[0][1],2));
		
		//System.out.println("d="+d);
		
		//get the difference and sum of two radiuses
		if(r0>=r1)
			rdiff=r0-r1;
		else
			rdiff=r1-r0;
		
		rsum=r0+r1;
		
		//System.out.println("rdiff="+rdiff);
		//System.out.println("rsum="+ rsum);
		
		System.out.println();
		
		// check the position relationship of two circles
		if(rsum<d)
			System.out.println("Two circles are separate from each other.");
		else if(rsum==d)
			System.out.println("Two circles are externally touching each other.");
		else if(rdiff < d && d < rsum)
			System.out.println("Two circles are overlapping each other.");
		else if(rdiff==d)
			System.out.println("Two circles are internally touching each other.");
		else if(d < rdiff)
			System.out.println("One circle is completely within another.");
		
	}
	
}
