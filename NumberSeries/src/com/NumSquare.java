package com;

import java.util.Scanner;

public class NumSquare {

	public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    System.out.println("Enter a number...");
    int n = s.nextInt();
    int a = 1;
    while(a<=n) {
    	
    	int sq = a*a;
    	System.err.println(sq);
    	a++;
    	
    }
		
		
		
	}

}
