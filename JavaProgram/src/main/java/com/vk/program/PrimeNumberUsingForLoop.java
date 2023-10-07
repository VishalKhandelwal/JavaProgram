package com.vk.program;

public class PrimeNumberUsingForLoop {
	public static void main(String[] args) {
		 for(int i=1;i<=100;i++) {
	        	for(int j=2;j<=i;j++) {
	        		if(j==i) {
	        			System.out.println(i);
	        		}
	        		if(i%j == 0) {
	        			break;
	        		}
	        	}
	        }
		 
		 //======2nd approach==========
		 int start = 1, end = 50;
			for (int i = start; i <= end; i++) {
				if (isPrime(i)) {
					System.out.println(i);
				}
			}
    }
	
	//check if the number is prime or not 
			public static boolean isPrime(int n) {
				if (n <= 1) {
					return false;
				}
				for (int i = 2; i <= Math.sqrt(n); i++) {
					if (n % i == 0) {
						return false;
					}
				}
				return true;
			}
}
