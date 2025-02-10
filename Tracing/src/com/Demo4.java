package com;

import java.util.Scanner;

public class Demo4 {

	public static void main(String[] args) {

		// wajp to find the count of digits in a given no.
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number...");
		int n = s.nextInt();
		int count = 0;
		while(n>0)
		{
			n/=10;
			count++;
		}
		System.out.println(count);
		s.close();
	}

}
