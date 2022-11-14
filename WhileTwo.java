package com.bridgelabz.daytwo;
import java.util.*;

public class WhileTwo {
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number:");
		int n = scan.nextInt();
		int num = 0;
		while(n>0) {
			 int rev = n%10;
			 num = (num*10) + rev;
			 n=n/10;
		}
		System.out.println("The reversed number is: "+num);
	}

}
