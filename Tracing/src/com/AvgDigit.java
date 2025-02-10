package com;

import java.util.Scanner;

public class AvgDigit {

	public static void main(String[] args) {


		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number...");
		int n = s.nextInt();
		int sum = 0;
		int count = 0;
		
		while (n!= 0)
		{
			int digit = n%10;
			count ++;
			sum = sum + digit;
			n= n/10;

			
		}
		System.out.println("Average is = "+sum/count);
		
		
		
		
	}

}
