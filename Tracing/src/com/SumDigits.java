package com;

import java.util.Scanner;

public class SumDigits {

	public static void main(String[] args) {


		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number...");
		int n = s.nextInt();
		
		int sum = 0;
		while(n!=0)
		{
			
			int digit = n%10;
			sum = sum + digit;
			n = n/10;
		}
		System.out.println("Sum is = "+sum);
		
		
		
		
	}

}
