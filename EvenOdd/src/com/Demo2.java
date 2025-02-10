package com;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
        
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number...");
		int n = s.nextInt();
		int a = 1;
		while(a<=n)
		{
			if (a%2==1) {
				System.out.println(a);
				
			}
			a++;
		}
		
		
		
	}

}
