package com;
import java.util.Scanner;

public class XylemPhloem {

	public static void main(String[] args) {


		//1223
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int lastsum = n%10;
		n = n/10;		
		int sum = 0;
		 while(n>9)
		 {
			 int digit = n%10;
			 sum = sum+digit;
			 n/=10;
		 }
		 
		 lastsum = lastsum+n;
		 
		 if(lastsum==sum)
		 {
			 System.out.println("It is xylem number");
			 
		 }else {
			 System.out.println("It is phloem number");
		 }
		
		
		
		
	}

}
