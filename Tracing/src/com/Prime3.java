package com;

import java.util.Scanner;

public class Prime3 {

	public static void main(String[] args) {
//to find the no. of primes in given range
		
	
		
		for (int j = 2; j<=10; j++)
		{	boolean flag = true;
			for(int i = 2; i<j; i++)
			{
				if(j%i==0) {
					flag = false;
					break;
				}
				
			}
			if(flag==true) {
				System.out.println(j );
				}
		}
		
	}

}
