package com.vk.program;

import java.util.stream.IntStream;

public class PalindromeUsingStreamAPI {

	public static void main(String[] args) {	
		String abc = "Nitin";
		if(isPalindrome(abc.toLowerCase()))
		System.out.println("Number is Palindrome");
		else
			System.out.println("Number is not Palindrome");		
	}	
	private static boolean isPalindrome(String input) {
		return IntStream.range(0, input.length() / 2)
				.noneMatch(index -> input.charAt(index) != input.charAt(input.length() - index - 1));
	}
}
