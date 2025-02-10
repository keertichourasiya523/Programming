package com;

import java.util.Scanner;

public class ReverseDigits {

	public static void main(String[] args) {
// wajp to reverse a given number
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number");
		int n = s.nextInt();
		int rev = 0;
		
		while(n!=0) {
			
			int digit = n%10;
			rev = rev * 10 + digit;
			n/=10;
		}
		System.out.println(rev);
		
		
	}

}
