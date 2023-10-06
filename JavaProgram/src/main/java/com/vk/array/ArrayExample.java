package com.vk.array;

public class ArrayExample {

	public static void main(String[] args) {
		int a[][] = {{3,4,5},{3,1,7}};
		
		
		for(int i[]:a) {
		  for(int j:i) {
			  System.out.print(j);
		  }
		  System.out.println();
		}
			
	}
}
