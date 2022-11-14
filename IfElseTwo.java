package com.bridgelabz.daytwo;
import java.util.*;
public class IfElseTwo {

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number:");
		int n = scan.nextInt();
		
		if (n>=1 && n<10) {
			System.out.println("Unit");
		}
		else if (n>=10 && n<100) {
			System.out.println("Ten");
		}
		else if (n>=100 && n<1000) {
			System.out.println("Hundred");
		}
		else if (n>=1000 && n<10000) {
			System.out.println("Thousand");
		}
		else {
			System.out.println("Enter a valid number.");
		}
	}
}
