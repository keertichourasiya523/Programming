package com;

import java.util.Scanner;

public class HappyNum {
           //10 13 19
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = s.nextInt();
		while(n!=1&&n!=4) {
			int sum = 0;
		while(n!=0)
		{
			
			int digit = n%10;
			int sq = digit*digit;
			sum = sum+sq;
			n = n/10;
			
		}
		n = sum;
		}
		
		if(n == 1)
			System.out.println(":)   Happy number   :)");
		else 
			System.out.println(":(   Sad number   :(");
		
	}

}
