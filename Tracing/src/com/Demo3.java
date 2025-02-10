package com;

import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {

        //wajp to find small digit
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number...");
		int n = s.nextInt();
		
		int small = n%10;
		while (n!=0) {
			
			int digit = n%10;
			if (digit<small) {
				small = digit;
			}
			n=n/10;
			
		}
		System.out.println("Smallest digit is : "+small);
		
	}

}
