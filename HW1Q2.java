// CISC 3150
// Xin Guan
// 9/2/2015

import java.util.*;

public class HW1Q2{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		double r;
		double output;
		
		while(sc.hasNext()){
			
			r=sc.nextDouble();
			
			output= Math.PI * Math.pow(r, 2);
			
			System.out.println(output);
			
		}	
		
	}
	
}
