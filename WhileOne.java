package com.bridgelabz.daytwo;
import java.util.*;

public class WhileOne {

	public static void main(String args[]) {
		 Scanner scan = new Scanner(System.in);
		 System.out.print("Enter a number:");
		 int n = scan.nextInt();
		 int sum = 0;
		 
		 while(n>0) {
			 sum = sum + n;
			 n--;
		 }
	     System.out.println("The sum is: "+ sum);
	}
}
