package com;

import java.util.Scanner;

public class Factors {

	public static void main(String[] args) {
		// Factor of given no.
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a no.");
		int n = s.nextInt();
		
		for (int i = 1; i<n; i++) {
			
			if(n%i==0) {
				System.out.println(i);
			}
			
		}
		
		
	}

}
