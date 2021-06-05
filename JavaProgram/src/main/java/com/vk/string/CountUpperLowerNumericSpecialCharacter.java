package com.vk.string;

// Java program to count the uppercase,
// lowercase, special characters
// and numeric values

import java.io.*;

class CountUpperLowerNumericSpecialCharacter
{
	public static void main(String args[])
	{
		String str = "#GeeKs01fOr@gEEks07";
		int upper = 0, lower = 0, number = 0, special = 0;
		StringBuilder upperCharacter = new StringBuilder();
		StringBuilder lowerCharacter = new StringBuilder();
		StringBuilder numericCharacter = new StringBuilder();
		StringBuilder specialCharacter = new StringBuilder();

		for(int i = 0; i < str.length(); i++)
		{
			char ch = str.charAt(i);
			if (ch >= 'A' && ch <= 'Z') {
				upper++;
			    upperCharacter.append(str.charAt(i));  
			}
			else if (ch >= 'a' && ch <= 'z') {
				lower++;
				lowerCharacter.append(str.charAt(i)); 
			}
			else if (ch >= '0' && ch <= '9') {
				number++;
				numericCharacter.append(str.charAt(i));
			}
			else {
				special++;
				specialCharacter.append(str.charAt(i));  
			}
		}

		System.out.println("Lower case letters : " + lower);
		System.out.println("Upper case letters : " + upper);
		System.out.println("Number : " + number);
		System.out.println("Special characters : " + special);
		
		System.out.println("Lower case character : " + lowerCharacter.toString());
		System.out.println("Upper case character : " + upperCharacter.toString());
		System.out.println("Number : " +  numericCharacter);
		System.out.println("Special character : " + specialCharacter.toString());
	}
}
