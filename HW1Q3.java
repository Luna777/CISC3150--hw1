// CISC 3150
// Xin Guan
// 9/2/2015
//
//learned an example of switch statement from:
//https://docs.oracle.com/javase/tutorial/java/nutsandbolts/switch.html
//
//learned an example of random class from:
//http://www.tutorialspoint.com/java/util/random_nextint_inc_exc.htm

import java.util.*;

public class HW1Q3{
	
	public static void main(String[] args){
		
		
		int num;
		String month;
		
		Random randomNumber = new Random();
		
		num = randomNumber.nextInt(12); //pick a random number from 0 to 11
		num++;							//add 1 to num, then num will be random from 1 to 12
		
		switch(num){
			
			case 1:  month = "January";
            		break;
			case 2:  month = "February";
            		break;
			case 3:  month = "March";
            		break;
			case 4:  month = "April";
            		break;
			case 5:  month = "May";
            		break;
			case 6:  month = "June";
            		break;
			case 7:  month = "July";
            		break;
			case 8:  month = "August";
            		break;
			case 9:  month = "September";
            		break;
			case 10: month = "October";
            		break;
			case 11: month = "November";
            		break;
			case 12: month = "December";
            		break;
            		default: month = "error";
            		break;
            	
		}
		
		System.out.println(num);
		System.out.println(month);
		
	}
	

	
}
