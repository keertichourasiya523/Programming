package com;

import java.util.Scanner;

public class FactorialDemo {

	public static void main(String[] args) {


		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number...");
		int n = s.nextInt();
		int f = 1;
		for(int i = 1; i <= n; i++)
		{
			f = f * i;
		}
		
		System.out.println("Factorial is = "+f);
		
	}

}
