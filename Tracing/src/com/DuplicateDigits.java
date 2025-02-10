package com;

import java.util.Scanner;

public class DuplicateDigits {

	public static void main(String[] args) {
    // find the duplicate digits
		
		Scanner s = new Scanner(System.in);
	    System.out.println("Enter a number...");
	    int n = s.nextInt();
	    int count = 0;
	    int digit=0;
	    while(n!=0) {
	    	
	    	 digit = n%10;
	    	count++;
	    	n/=10;
	    	
	    }
	    if (count>2) {
	    	System.out.println("duplicate value is = "+digit);
	    }
	    
		
		
		
		
		
		
		
		
		
		
		
	}

}
