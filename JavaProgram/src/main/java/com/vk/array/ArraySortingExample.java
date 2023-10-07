package com.vk.array;

import java.util.Arrays;

public class ArraySortingExample {

	public static void main(String[] args) {
		int[] intArr = { 1543, 3553, 3556, 1234, 5678, 56, 785, 456, 8976, 32 };
		String[] stringArr = { "Java", "Python", "PHP", "C#", "C Programming", "C++" };
		System.out.println(Arrays.toString(intArr));
		Arrays.sort(intArr);
		System.out.println(Arrays.toString(intArr));
		System.out.println(Arrays.toString(stringArr));
		Arrays.sort(stringArr);
		System.out.println(Arrays.toString(stringArr));
	}
}
