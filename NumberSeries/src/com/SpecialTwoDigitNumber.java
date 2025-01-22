package com;

import java.util.Scanner;

public class SpecialTwoDigitNumber {

	public static void main(String[] args) {

// 49 59
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a two digit number...");
		int n = s.nextInt();
		if(n>9&&n<100) {
		int d1 = n%10;
		int d2 = n/10;
	    int sum = d1*d2+(d1+d2);
	    
	    if(n==sum) {
	    	System.out.println("It is a special two digit number...");
	    }
	    else {
	    	System.out.println("It is not a special two digit number...");
	    }
		
		}
		else
			System.out.println("It is not a two digit number...");
		
		
	}

}
