package com;

import java.util.Scanner;

public class PerfectNumber {
public static void main(String[] args) {
	// their factor's sum equal to that no. or not called perfect square
	Scanner s = new Scanner(System.in);
	System.out.println("Enter a number...");
	int n = s.nextInt();
	int sum = 0;
	 
	for (int i = 1; i<=n/2; i++) {
		if(n%i==0) {
		sum = sum + i;
		
		}
		
	}
	if(sum==n) {
		System.out.println("This is a perfect number...");
		
	}else {
		System.out.println("This is not a perfect number...");
	}
		
	
	
	
}
}
