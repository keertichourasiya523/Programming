package com;

import java.util.Scanner;

public class PrimePallindrome {

	public static void main(String[] args) {
		// wajp to check the no. is prime pallindrome no. or not
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		boolean flag = true;
		
		for (int i = 2; i<n; i++)
		{
			if(n%i==0) {
				flag = false;
				break;
			}
			
		}
		if(flag == false)
		{
			System.out.println("It is not a prime no. so it is also not a prime pallindrome no.");
			
		}else {
			int rev = 0; 
			int temp = n;
			while (n!= 0) {
				int digit = n%10;
				rev = rev*10+digit;
				n/=10;
				
			}
			if (rev == temp)
			{
				System.out.println("It is a prime pallindrome no.");
				
			}else {
				System.out.println("It is not a prime pallindrome no.");
			}
			
			
			
			
		}
		
	}

}
