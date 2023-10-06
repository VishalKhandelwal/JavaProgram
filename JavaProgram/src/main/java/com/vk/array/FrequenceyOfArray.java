package com.vk.array;

// Java program to count frequencies of array items
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class FrequenceyOfArray {

	// Driver code
	public static void main(String[] args) {
		int arr[] = new int[] { 10, 20, 20, 10, 10, 20, 5, 20 };
		int n = arr.length;
		countFreq4(arr, n);
	}

	public static void countFreq1(int arr[], int n) {
		boolean visited[] = new boolean[n];

		Arrays.fill(visited, false);

		// Traverse through array elements and
		// count frequencies
		for (int i = 0; i < n; i++) {

			// Skip this element if already processed
			if (visited[i] == true)
				continue;

			// Count frequency
			int count = 1;
			for (int j = i + 1; j < n; j++) {
				if (arr[i] == arr[j]) {
					visited[j] = true;
					count++;
				}
			}
			System.out.println(arr[i] + " " + count);
		}
	}

	static void countFreq2(int arr[], int n) {
		Map<Integer, Integer> mp = new HashMap<>();

		// Traverse through array elements and
		// count frequencies
		for (int i = 0; i < n; i++) {
			if (mp.containsKey(arr[i])) {
				mp.put(arr[i], mp.get(arr[i]) + 1);
			} else {
				mp.put(arr[i], 1);
			}
		}
		// Traverse through map and print frequencies
		for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}

	static void countFreq3(int arr[], int n) {
		Map<Integer, Integer> mp = new HashMap<>();

		// Traverse through array elements and
		// count frequencies
		for (int i = 0; i < n; i++) {
			mp.put(arr[i], mp.get(arr[i]) == null ? 1 : mp.get(arr[i]) + 1);
		}

		// To print elements according to first
		// occurrence, traverse array one more time
		// print frequencies of elements and mark
		// frequencies as -1 so that same element
		// is not printed multiple times.
		for (int i = 0; i < n; i++) {
			if (mp.get(arr[i]) != -1) {
				System.out.println(arr[i] + " " + mp.get(arr[i]));
				mp.put(arr[i], -1);
			}
		}
	}

	static void countFreq4(int arr[], int size) {
		// Creating a HashMap containing integer
		// as a key and occurrences as a value
		HashMap<Integer, Integer> freqMap = new HashMap<Integer, Integer>();

		for (int i = 0; i < size; i++) {
			if (freqMap.containsKey(arr[i])) {

				// If number is present in freqMap,
				// incrementing it's count by 1
				freqMap.put(arr[i], freqMap.get(arr[i]) + 1);
			} else {

				// If integer is not present in freqMap,
				// putting this integer to freqMap with 1 as it's value
				freqMap.put(arr[i], 1);
			}
		}

		// Printing the freqMap
		for (Map.Entry entry : freqMap.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}

}
