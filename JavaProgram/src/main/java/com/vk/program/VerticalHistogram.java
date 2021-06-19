package com.vk.program;

public class VerticalHistogram {

	public static void main(String[] args) {
		method1();
	}

	public static void method1() {
		int arr[] = { 2, 4, 2, 3, 5, 6 };
		int max = arr[0];
		int len = arr.length;
		for (int i = 0; i < len; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		while (max > 0) {
			for (int j = 0; j < len; j++) {
				if (max == arr[j]) {
					System.out.print("*");
					// System.out.print(arr[j]);
					arr[j]--;
					// System.out.print(arr[j]);
				} else {
					System.out.print(" ");
				}
			}
			System.out.println("");
			max--;
		}
	}
}
