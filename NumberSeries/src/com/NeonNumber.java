package com;

import java.util.Scanner;

public class NeonNumber {

	//9
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int sq = n*n;
		int sum = 0;
		while(sq!=0)
		{
			int digit = sq%10;
			sum = sum+digit;
			sq/=10;	
		}
              
		if(sum == n)
			System.out.println("Neon number...");
		else
			System.out.println("Not a Neon number...");
	}

}
