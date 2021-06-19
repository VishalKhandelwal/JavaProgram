package com.vk.program;

import java.util.stream.LongStream;

public class FactorialExample {

	public static void main(String[] args) {
		//method1();
		
//		int fact=1;
//		int number =5;
//		fact=factorialUsingRecursion(number);
//		System.out.println("Factorial of "+number+" is: "+fact);
		
		System.out.println(factorialUsingStreams(0));
	}

	//simple for loop
	private static void method1() {
		int i,fact=1;
		int number = 5;
		for(i=1;i<=number;i++) {
			fact = fact * i;
		}
		System.out.println("Factorial of "+number+" is: "+fact);
	}
	
	//Recursion
	private static int factorialUsingRecursion(int n) {
		if(n==0) 
			return 1;
		else
			return (n*factorialUsingRecursion(n-1));
	}
	
	//factorial using java 8 stream
	public static long factorialUsingStreams(int n) {
	    return LongStream.rangeClosed(1, n)
	        .reduce(1, (long x, long y) -> x * y);
	}
}
