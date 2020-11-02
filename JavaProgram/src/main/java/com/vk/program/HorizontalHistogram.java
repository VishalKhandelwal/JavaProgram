package com.vk.program;

public class HorizontalHistogram {

	public static void main(String[] args) {
		//method1();
		method2();
	}
	
	public static void method1() {
		int arr[] = {6,2,4,3,5};
		for(int i=0; i<arr.length;i++) {
			for(int j=0;j<arr[i];j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void method2() {

	    int array[] = {4,10,7,15,12,3,7,10,6,19};
	 
	    String output = "Element\tValue\tHistogram";
	 
	    for ( int counter = 0; counter < array.length; counter++ ) {
	      output += "\n" + counter + "\t" + array[ counter ] + "\t";
	 
	      for ( int stars = 0; stars < array[ counter ]; stars++ ) {
	        output += "*";   
	      }
	    }
	    System.out.println(output);
	}
}
