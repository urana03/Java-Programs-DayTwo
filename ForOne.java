package com.bridgelabz.daytwo;

import java.util.Scanner;

public class ForOne {
    
	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number:");
		int n = scan.nextInt();
		int sum = 0;
		for(int num=0; num<=n; num++ ) {
			sum = sum + num;
		}
		System.out.println("The sum is:"+ sum);
	}
}
