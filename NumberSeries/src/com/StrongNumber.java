package com;

import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {


		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number...");
		int n = s.nextInt();
		int sum = 0;
		int temp = n;
		
		while(n!=0)
		{
			int digit = n%10;
			int fact = 1;
			for(int i = 1;i<=digit;i++)
			{
				fact = fact*i;
			}
			sum = sum+fact;
			n/=10;
		}
		if(sum == temp)
			System.out.println("Strong number...");
		else
			System.out.println("Not a Strong number...");

		
		
		
	}

}
