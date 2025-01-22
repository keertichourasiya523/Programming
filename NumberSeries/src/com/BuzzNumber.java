package com;

import java.util.Scanner;

public class BuzzNumber {

	public static void main(String[] args) {
// if the no. is divisible by 7 or end with 7
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number...");
		int n = s.nextInt();
		
		if(n%10 == 7 || n%7 == 0) {
			System.out.println("this is a buzz number...");
		}
		else
			System.out.println("Not a buzz number...");

		
		
		
	}

}
