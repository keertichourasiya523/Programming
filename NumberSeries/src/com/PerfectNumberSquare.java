package com;

import java.util.Scanner;

public class PerfectNumberSquare {

	public static void main(String[] args) {

// 36 25
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number...");
		int n = s.nextInt();
		boolean flag = true;
		for(int i = 0; i<=n/2; i++)
		{
			if(i*i==n) {
				flag = false;
				break;
			}
		}
		if(flag == false)
		{
			System.out.println("It is a perfect square number");;
		}else {
			System.out.println("It is not a perfect square number");
		}
		
		
	}

}
