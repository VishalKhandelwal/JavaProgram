package com.vk.string;

public class ReverseStringUsingRecursion {

	public static void main(String[] args) {
		String str = "hello";

		String reversedStr = reverseString(str);

		System.out.println(reversedStr); // olleh
	}
	public static String reverseString(String str) {
		  if (str.isEmpty() || str.length() == 1) {
		    return str;
		  } else {
		    return reverseString(str.substring(1)) + str.charAt(0);
		  }
		}

}
