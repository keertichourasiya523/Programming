package com;

import java.util.Scanner;

public class PronicNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a no.");
		int n = s.nextInt();
		boolean flag = false;
		
		for(int i = 1; i<=n;i++) {
			if(i*(i+1)==n)
			{
				flag = true;
				break;
			}
		}
		if(flag==true) {
		System.out.println("Pronic no.");
		}
		else {
			System.out.println("Not a pronic no.");
		}
	}

}
