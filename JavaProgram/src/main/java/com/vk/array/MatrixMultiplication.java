package com.vk.array;

public class MatrixMultiplication {

	public static void main(String[] args) {
		int a[][] = { { 1, 1, 1 }, { 2, 2, 2 }, { 3, 3, 3} };
		int b[][] = { { 1, 1, 1 }, { 2, 2, 2 }, { 3, 3, 3} };	
		int rowsA = a.length;
        int columnA = a[0].length;
        int columnB = b[0].length;
		int c[][] = new int[rowsA][columnB];
		for (int i = 0; i < rowsA; i++) {
			for (int j = 0; j < columnB; j++) {
				c[i][j] = 0;
				for(int k=0;k<columnA;k++) {
					c[i][j] += a[i][k] * b[k][j];
				}
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}
}
