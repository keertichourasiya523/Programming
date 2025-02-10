package com;

import java.util.Scanner;

public class Prime4 {

	public static void main(String[] args) {
        
		//wajp to find the prime no. between 10 and 30
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number..");
		int start = s.nextInt();
		System.out.println("Enter next number...");
		int end = s.nextInt();
		
		for (int i = start; i<end; i++)
		{
			boolean flag = true;
			for(int j = 2; j<i; j++)
			{
				if(i%j==0) {
					flag = false;
					break;
				}
			}
			if(flag==true) {
				System.out.println(i);
				
			}
		}
		
		
		
		
		
	}

}
