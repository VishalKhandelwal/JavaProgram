package com.vk.string;

public class ReverseStringUsingStringBuilder {

	public static void main(String[] args) {
		String str = "hello";		
		String reversedStr = new StringBuilder(str).reverse().toString();
		System.out.println(reversedStr); // olleh

	}
}
