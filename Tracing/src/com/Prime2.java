package com;

import java.util.Scanner;

public class Prime2 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number...");
		int n = s.nextInt();
		boolean flag = true;
		// for(int i=2; i<n; i++)
		for (int i = 2; i <= n / 2; i++)// to make our code more optimized we can use this method
		{
			if (n % i == 0) {
				flag = false;
				break;
			}
		}
		if (flag == true) {
			System.out.println("It is a prime number...");
		} else {
			System.out.println("It is not prime number...");
		}

	}

}
