package com.vk.string;

import java.util.Scanner;

public class ReverseStringUsingForLoop {

	public static void main(String[] args) {
		String input;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		input = sc.nextLine();
		String reversedStr = "";
		for (int i = input.length() - 1; i >= 0; i--) {
			reversedStr += input.charAt(i);
		}
		System.out.println(reversedStr); // olleh
	}
	
}
