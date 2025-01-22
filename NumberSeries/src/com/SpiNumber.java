package com;

import java.util.Scanner;

public class SpiNumber {

	public static void main(String[] args) {


		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number to check it is spi number or not...");
		int n = s.nextInt();
		int product = 1;
		int sum = 0;
		while(n!=0)
		{
			int digit = n%10;
			sum = sum + digit;
			product = product* digit;
			n=n/10;
			
		}
		if(sum == product)
		{
			System.out.println("It is a spi number");
		}else {
			System.out.println("It is not a spi number");
		}
		
		
		
		
		
		
	}

}
