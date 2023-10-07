package com.vk.array;

import java.util.Scanner;

public class SumOfEvenAndOdd {

	public static void main(String[] args) {
		int n, sumE = 0, sumO = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of elements in array: ");
		n = s.nextInt();
		int numbers[] = new int[n];
		System.out.println("Enter the elements of the array: ");
		for (int i = 0; i < n; i++) {
			numbers[i] = s.nextInt();
		}
		for (int number : numbers) {
			if (number % 2 == 0) {
				sumE += number;
			} else {
				sumO += number;
			}
		}
		System.out.println("Sum of even numbers: " + sumE);
		System.out.println("Sum of odd numbers: " + sumO);
	}
}
