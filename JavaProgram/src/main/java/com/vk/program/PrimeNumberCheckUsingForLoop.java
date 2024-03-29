package com.vk.program;

public class PrimeNumberCheckUsingForLoop {
	public static void main(String[] args) {
		System.out.println(isPrime(5));
		checkPrime(5);
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

		//check if the number is prime or not 
		static void checkPrime(int n) {
			int i, m = 0, flag = 0;
			m = n / 2;
			if (n == 0 || n == 1) {
				System.out.println(n + " is not prime number");
			} else {
				for (i = 2; i <= m; i++) {
					if (n % i == 0) {
						System.out.println(n + " is not prime number");
						flag = 1;
						break;
					}
				}
				if (flag == 0) {
					System.out.println(n + " is prime number");
				}
			} // end of else
		}

}
