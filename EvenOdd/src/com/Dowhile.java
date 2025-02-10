package com;

import java.util.Scanner;

public class Dowhile {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number...");
		int n = s.nextInt();
		int a = 1;
		
		// even
//		do {
//			if(a%2==0)
//			{
//				System.out.println(a);
//			}
//			a++;
//		}while(a<=n);
//		
	//odd
		do {
			if (a%2==1)
			{
				System.out.println(a);
			}
			a++;
		}while(a<=n);
		
		
	}

}
