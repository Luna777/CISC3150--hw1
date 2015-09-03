// CISC 3150
// Xin Guan
// 9/2/2015

import java.util.*;

public class HW1Q5{
	
	public static void main(String[] args){
		
		double[][] point = new double[3][2]; // 3 point: A, B, C
											 // each point has 2 value, x and y, for its coordinate
		double[] d = new double[3];
		
		Scanner my_sc = new Scanner(System.in);
		
		//get coordinate of each point
		System.out.print("enter point A's Coordinate(use space to separate them, ex:4.5 2.1): ");
		
		point[0][0]= my_sc.nextDouble();
		point[0][1]= my_sc.nextDouble();
		
		System.out.print("enter point B's Coordinate(use space to separate them, ex:4.5 2.1): ");
		
		point[1][0]= my_sc.nextDouble();
		point[1][1]= my_sc.nextDouble();
		
		System.out.print("enter point C's Coordinate(use space to separate them, ex:4.5 2.1): ");
		
		point[2][0]= my_sc.nextDouble();
		point[2][1]= my_sc.nextDouble();
		
		//d[0] = distance from B to A
		//d[1] = distance from C to B
		//d[2] = distance from A to C
		d[0] = Math.sqrt(Math.pow((point[1][0]-point[0][0]),2) + Math.pow(point[1][1]-point[0][1],2));
		d[1] = Math.sqrt(Math.pow((point[2][0]-point[1][0]),2) + Math.pow(point[2][1]-point[1][1],2));
		d[2] = Math.sqrt(Math.pow((point[0][0]-point[2][0]),2) + Math.pow(point[0][1]-point[2][1],2));
		
		System.out.println();
		System.out.println("The length of each side of the triangle:");
		System.out.println("Length of AB is "+d[0]);
		System.out.println("Length of BC is "+d[1]);
		System.out.println("Length of CA is "+d[2]);
		
		//use bubble sort for d[] array.
		double temp;
		for(int i=0; i<d.length-1; i++){
			for(int j=1; j<d.length-i; j++){
				if(d[j-1]>d[j]){
					temp=d[j-1];
					d[j-1]=d[j];
					d[j]=temp;
				}
			}
		}
		
		//to check is the triangle real
		if(d[0]+d[1]>d[2]){
			System.out.println();
			System.out.println("Triangle ABC is a real triangle.");
		}
		else{
			System.out.println();
			System.out.println("Triangle ABC is a FAKE triangle!");
		}
		
		
	}//end main
	
	
}//end class HW1Q5
