package com;

import java.util.Scanner;

public class Demo {

	//wajp to find odd digit in even no.
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a number...");
		int n = s.nextInt();
		
		for(int i = 0; n!=0; n=n/10)
		{
			int digit = n%10;
			if(digit%2==0) {
				System.out.println(digit+" "+"even");
			}else {
				System.out.println(digit+" "+"odd");
			}
		}

		
		
	}

}
