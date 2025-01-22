package com;

import java.util.Scanner;

public class DuckNum {

	public static void main(String[] args) {


		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int count=0;
		
		while(n!=0)
		{
			int digit = n%10;
			if(digit==0) {
			count++;
			}
			n/=10;
			
		}
		if(count>0) {
			System.out.println("Duck Number");
			
		}else
			System.out.println("Not a Duck number");
		
		
		
		
		
	}

}
