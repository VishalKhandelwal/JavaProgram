package com.vk.array;

public class MatrixAddition {

	public static void main(String[] args) {
		int a[][] = { { 1, 3, 4 }, { 3, 4, 5 } };
		int b[][] = { { 1, 3, 4 }, { 3, 4, 5 } };	
		int rows = a.length;
        int columns = a[0].length;
		int c[][] = new int[rows][columns];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				c[i][j] = a[i][j] + b[i][j];
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
	}
}
