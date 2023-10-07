package com.vk.program;

import java.util.Scanner;

public class PalindromeUsingForLoop {

	public static void main(String[] args) {
		String original; // Objects of String class
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string/number to check if it is a palindrome");
		original = in.nextLine();		
		if (isPalindrome(original))
			System.out.println("Entered string/number is a palindrome.");
		else
			System.out.println("Entered string/number isn't a palindrome.");

	}
	
	public static boolean isPalindrome(String str) {
		  int length = str.length();
		  for (int i = 0; i < length / 2; i++) {
		    if (str.charAt(i) != str.charAt(length - i - 1)) {
		      return false;
		    }
		  }
		  return true;
		}
}
