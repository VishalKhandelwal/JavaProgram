package com.vk.program;

public class FactorialExample {

	public static void main(String[] args) {
		//method1();
		
		int i,fact=1;
		int number =5;
		fact=factorial(number);
		System.out.println("Factorial of "+number+" is: "+fact);
	}

	private static void method1() {
		int i,fact=1;
		int number = 5;
		for(i=1;i<=number;i++) {
			fact = fact * i;
		}
		System.out.println("Factorial of "+number+" is: "+fact);
	}
	
	private static int factorial(int n) {
		if(n==0) 
			return 1;
		else
			return (n*factorial(n-1));
	}
}