package com;

import java.util.Scanner;

public class SumEven {

	public static void main(String[] args) {
      
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number...");
		int n = s.nextInt();
        int a = 1;
        int sum = 0;
        while(a<=n) {
           if(a%2==0) {
        sum = sum+a;
           }
        a++;
        	
        }
		
        System.out.println(sum);

		
		
	}

}
