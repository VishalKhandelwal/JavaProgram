package com.vk.program;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrimeNumberUsingStreamAPI {
	public static void main(String[] args) {
		  System.out.println("\nPrime numbers within 10 and 31:\n" + primeNumbersInRange(10, 31));
	}

	//Generating prime numbers within the specific range. 
    public static List < Integer > primeNumbersInRange(int startingNumber, int endingNumber) {
        return IntStream
            .rangeClosed(startingNumber, endingNumber)
            .filter(x -> isPrimeJava8(x)).boxed()
            .collect(Collectors.toList());
    }
    
  //Java 8 way to check if the number is prime or not 
    private static boolean isPrimeJava8(int number) {
        return number > 1 && IntStream
            .range(2, number)
            .noneMatch(i -> number % i == 0);
    }
}
