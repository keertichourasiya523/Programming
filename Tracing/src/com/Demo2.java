package com;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {

		// wajp to find the largest digit in a given number
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number...");
		int n = s.nextInt();
		
		int large = n%10;
		
		while(n!=0)
		{
			int digit = n%10;
			if(digit>large) {
				large = digit;			
			}
			n=n/10;
		}
		System.out.println("Large number is : "+large);

		
		
	}

}
