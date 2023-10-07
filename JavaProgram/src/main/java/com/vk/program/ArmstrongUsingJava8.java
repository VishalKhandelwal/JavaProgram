package com.vk.program;

public class ArmstrongUsingJava8 {

	public static void main(String[] args) {
		int number=153;		
		if(isArmstrongNumber(number)){
		System.out.println("Armstrong number");
		}
		else{
		System.out.println("not Armstrong number");
		}

	}
	public static boolean isArmstrongNumber(int number) {
        int numberOfDigits = String.valueOf(number).length();

        int sumOfPowers = String.valueOf(number)
                .chars()
                .map(Character::getNumericValue)
                .map(digit -> (int) Math.pow(digit, numberOfDigits))
                .sum();

        return sumOfPowers == number;
    }
}
