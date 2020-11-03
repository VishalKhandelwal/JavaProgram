package com.vk.program;

public class PyramidExample {

	public static void main(String[] args) {
		//method1();
		//method2();
		method3();
	}
	

	private static void method1() {
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=9;j++)
			{
				if(j>=6-i && j<=4+i) {
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}		
	}
	
	private static void method2() {
		 for(int i=0;i<5;i++) {
	         for(int j=0;j<5-i;j++) {
	             System.out.print(" ");
	         }
	        for(int k=0;k<=i;k++) {
	            System.out.print("$ ");
	        }
	        System.out.println();  
	    }
		
	}
	
	private static void method3() {
		int min =1;
		for(int i=0;i<5;i++) {
			for(int j=4;j>i;j--) {
				System.out.print(" ");
			}
			for(int k=0;k<min;k++)
			{
				System.out.print("*");
			}
			min += 2;	
			System.out.println();
		}
		
	}
}
