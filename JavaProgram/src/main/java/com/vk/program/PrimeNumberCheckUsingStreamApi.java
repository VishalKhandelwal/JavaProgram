package com.vk.program;

import java.util.stream.IntStream;

public class PrimeNumberCheckUsingStreamApi {
	public static void main(String[] args) {
		System.out.println(isPrime(4));
		System.out.println(isPrime2(4));
	}

	//Java 8 way to check if the number is prime or not 
    private static boolean isPrime(int number) {
        return number > 1 && IntStream
            .range(2, number)
            .noneMatch(i -> number % i == 0);
    }
    
    //Java 8 another way to check if the number is prime or not 
    public static boolean isPrime2(int number) {

        if (number <= 1) return false; // 1 is not prime and also not composite

        return !IntStream.rangeClosed(2, number / 2).anyMatch(i -> number % i == 0);
    }
}
