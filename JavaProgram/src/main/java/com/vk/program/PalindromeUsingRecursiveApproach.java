package com.vk.program;

import java.util.Scanner;

public class PalindromeUsingRecursiveApproach {

	public static void main(String[] args) {
		String original; // Objects of String class
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string/number to check if it is a palindrome");
		original = in.nextLine();		
		if (isPalindromeRecursive(original))
			System.out.println("Entered string/number is a palindrome.");
		else
			System.out.println("Entered string/number isn't a palindrome.");

	}
	
	public static boolean isPalindromeRecursive(String str) {
		  if (str.length() <= 1) {
		    return true;
		  } else {
		    if (str.charAt(0) != str.charAt(str.length() - 1)) {
		      return false;
		    } else {
		      return isPalindromeRecursive(str.substring(1, str.length() - 1));
		    }
		  }
		}
}
