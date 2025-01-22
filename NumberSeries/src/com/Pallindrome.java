package com;

import java.util.Scanner;

public class Pallindrome {

	public static void main(String[] args) {

    //Check the no. is pallindrome no. or not 
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int rev = 0;
		int temp = n;
		
		while(n!=0) {
			
			int digit = n%10;
			rev = rev * 10 + digit;
			n/=10;
			
		}
		if(rev == temp) {
			System.out.println("It is a pallindrome no.");
		}else {
			System.out.println("It is not a prime no.");
		}
		
		
		
		
	}

}
