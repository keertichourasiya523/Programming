package com;

import java.util.Scanner;

public class MpowerN {

	public static void main(String[] args) {


		Scanner s = new Scanner(System.in);
		System.out.println("Enter value of m");
		int m = s.nextInt();
		System.out.println("Enter value of n");
		int n = s.nextInt();
		
		int product = 1;
		
		for (int i = 1; i <= n; i++)
		{
			product = product*m;
		}
		System.out.println("m power n is : "+product);
		
		
		
	}

}
