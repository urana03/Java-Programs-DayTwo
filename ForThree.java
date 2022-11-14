package com.bridgelabz.daytwo;

import java.util.Scanner;

public class ForThree {
	

	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a number to check if it is palindrome:");
		
		int n = scan.nextInt();
		int num1 = n;
        int rev=0;		
		for(; n>0 ; n=n/10) {
			
			int num= n%10;
			rev = (rev*10) + num;	
		}
		if(num1 == rev) {
			System.out.println("The given number is palindrome.");
		}
		else {
			System.out.println("The given number is not a palindrome.");
		}
		
		
	}

}
