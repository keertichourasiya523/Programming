package com;

import java.util.Scanner;

public class ProductDigit {

	public static void main(String[] args) {


		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number...");
		int n = s.nextInt();
		int product = 1;
		
		while (n!=0)
		{
			int digit = n%10;
			product = product*digit;
			n/=10;
		}
		 
		System.out.println("Product is = "+product);
		
		
		
		
	}

}
