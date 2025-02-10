package com;

import java.util.Scanner;

public class Demo1 {

	// wajp to print all the even no.s betweenn the given range
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = s.nextInt();
		int a = 2;
		while(a<=n)
		{
			if(a%2==0) {
			System.out.println(a);
		}
		
		a++;
		}
	}

}

