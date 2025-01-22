package com;

import java.util.Scanner;

public class Automorphic_Number {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number...");
		int n = s.nextInt();
		int sq = n*n;
		boolean flag = true;
		
		while(n!=0)
		{
			if(n%10 == sq%10)
			{
				n/=10;
				sq/=10;
			}
			else {
				flag = false;
				break;
			}
			
		}
		if(flag == true)
			System.out.println("It is automorphic number");
		else 
			System.out.println("It not automorphic number");
		
		
		
	}

}
