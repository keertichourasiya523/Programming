package com;

import java.util.Scanner;

public class Sunny_Number {
//8 4 48
	public static void main(String[] args) {

      Scanner s = new Scanner(System.in);
      System.out.println("Enter a number");
      int n = s.nextInt();
       
      int sum = n+1;
      boolean flag = false;
      
      for(int i = 1; i<n/2; i++)
      {
    	  if(i*i == sum)
    	  {
    		  flag = true;
    		  break;
    	  }
      }
      if(flag == true)
    	  System.out.println("It is sunny number");
      else
    	  System.out.println("Not a sunny number");
		
	}

}
