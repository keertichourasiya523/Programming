package com;

import java.util.Scanner;

public class DisariumNumber {

	public static void main(String[] args) {

		//175 89

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int temp1 = n;
		int temp2 = n;
		int count = 0;
		int sum = 0;
		
		while(temp1!=0)
		{
			count++;
			temp1/=10;
		}
		while(temp2!=0)
		{
			int digit = temp2%10;
			sum = sum+(int)Math.pow(digit, count--);
			temp2/=10;
			
		}
		if (sum==n)
			System.out.println("Disarium number...");
		else
			System.out.println("Not a Disarium number...");
		
		
		
	}

}
