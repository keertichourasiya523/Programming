package com;

import java.util.Scanner;

public class Armstrongnumber {

	public static void main(String[] args) {

        //370 153
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the nth value..");
		int n = s.nextInt();
		int temp = n;
		int temp2 = n;
		int sum = 0;
		int count=0;
		
		while(n!=0)
		{
			int digit = temp%10;
			count++;
			n/=10;
		}
		while(temp!=0)
		{
			int digit = temp%10;
			int product = 1;
			for(int i = 1; i<=count;i++) {
				product = product*digit;
			}
			sum = sum + product;
			temp = temp/10;
		}
		if(sum==temp2) {
			System.out.println("It is an armstrong number...");
		}else {
			System.out.println("It is not12 an armstrong number...");
		}
		
		
		
		
	}

}
