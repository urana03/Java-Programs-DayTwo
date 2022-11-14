package com.bridgelabz.daytwo;
import java.util.*;
public class SwitchOne {

	public static void main(String args[]) {
	
		Scanner scan = new Scanner(System.in);
	
		System.out.print("Enter a small character only:");
	
		char n = scan.next().charAt(0);
	
	
		switch (n) {
	  
		case 'a':
			System.out.println("Vowel");
		break;
		
		case 'e':
			System.out.println("Vowel");
		break;
		
		case 'i':
			System.out.println("Vowel");
		break;
		
		case 'o':
			System.out.println("Vowel");
		break;
		
		case 'u':
			System.out.println("Vowel");
		break;
		
		default:
			System.out.println("Consonant");
		
	
		}
    }
}	
