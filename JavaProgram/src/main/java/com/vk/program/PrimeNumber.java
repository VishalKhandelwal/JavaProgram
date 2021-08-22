package com.vk.program;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrimeNumber {

	public static void main(String[] args) {
		System.out.println(isPrimeJava8(4));
		System.out.println(isPrime(4));
		System.out.println(isPrimeJava8AnotherWay(7));
		// checkPrime(4);
		printNumberBetween();
	    System.out.println("Prime numbers until 50:\n" + primeNumbersUnTil(50));
        System.out.println("\nPrime numbers within 10 and 31:\n" + primeNumbersInRange(10, 31));
        System.out.println("\nPrime numbers within 10 and 31 using loop:\n");
        primeNumbersInRangeUsingLoop(1,31);
    }
 
    //Generating prime numbers till the number we want. 
    public static List < Integer > primeNumbersUnTil(int n) {
        return IntStream
            .rangeClosed(2, n)
            .filter(x -> isPrimeJava8(x)).boxed()
            .collect(Collectors.toList());
    }
 
    //Generating prime numbers within the specific range. 
    public static List < Integer > primeNumbersInRange(int startingNumber, int endingNumber) {
        return IntStream
            .rangeClosed(startingNumber, endingNumber)
            .filter(x -> isPrimeJava8(x)).boxed()
            .collect(Collectors.toList());
    }
    
  //Generating prime numbers within the specific range. 
    public static void primeNumbersInRangeUsingLoop(int startingNumber, int endingNumber) {
        for(int i=startingNumber;i<=endingNumber;i++) {
        	for(int j=2;j<=i;j++) {
        		if(j==i) {
        			System.out.print(i+",");
        		}
        		if(i%j == 0) {
        			break;
        		}
        	}
        }
        System.out.println();
    }
 
    //Java 8 way to check if the number is prime or not 
    private static boolean isPrimeJava8(int number) {
        return number > 1 && IntStream
            .range(2, number)
            .noneMatch(i -> number % i == 0);
    }

    //Java 8 another way to check if the number is prime or not 
    public static boolean isPrimeJava8AnotherWay(int number) {

        if (number <= 1) return false; // 1 is not prime and also not composite

        return !IntStream.rangeClosed(2, number / 2).anyMatch(i -> number % i == 0);
    }
    
  //Generating prime numbers within the specific range. 
	public static void printNumberBetween() {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the first number : ");
		int start = s.nextInt();
		System.out.print("Enter the second number : ");
		int end = s.nextInt();
		System.out.println("List of prime numbers between " + start + " and " + end);
		for (int i = start; i <= end; i++) {
			if (isPrime(i)) {
				System.out.println(i);
			}
		}
	}

	//check if the number is prime or not 
	public static boolean isPrime(int n) {
		if (n <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	//check if the number is prime or not 
	static void checkPrime(int n) {
		int i, m = 0, flag = 0;
		m = n / 2;
		if (n == 0 || n == 1) {
			System.out.println(n + " is not prime number");
		} else {
			for (i = 2; i <= m; i++) {
				if (n % i == 0) {
					System.out.println(n + " is not prime number");
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				System.out.println(n + " is prime number");
			}
		} // end of else
	}

}
