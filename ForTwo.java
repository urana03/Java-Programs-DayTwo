package com.bridgelabz.daytwo;

import java.util.Scanner;

public class ForTwo {

	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number:");
		int n = scan.nextInt();
        int rev=0;		
		for(; n>0 ; n=n/10) {
			
			int num= n%10;
			rev = (rev*10) + num;
			
		}
		System.out.println("The reverse of number is:"+ rev);
	}
	
}
