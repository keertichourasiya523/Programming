package com;

import java.util.Scanner;

public class FibbonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int firstnum=0;
		int secondnum = 1;
		int nextnum=0;
		for(int i = 0; i<=n; i++)
		{
			System.out.print(firstnum+",");
			nextnum = firstnum+secondnum;
			firstnum = secondnum;
			secondnum= nextnum;
		}
		
		
		
	}

}
