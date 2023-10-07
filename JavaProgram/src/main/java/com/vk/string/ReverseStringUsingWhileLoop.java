package com.vk.string;

public class ReverseStringUsingWhileLoop {

	public static void main(String[] args) {
		String str = "hello";

		String reversedStr = ""; 
		int i = str.length();
		while(i>0) {
			reversedStr += str.charAt(i-1);
			i--;
		}
		System.out.println(reversedStr); // olleh
	}
}
