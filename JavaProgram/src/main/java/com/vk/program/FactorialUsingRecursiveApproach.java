package com.vk.program;

public class FactorialUsingRecursiveApproach {
    public static int factorial(int number) {
        if (number == 0) {
            return 1;
        } else {
            return number * factorial(number - 1);
        }
    }

    public static void main(String[] args) {
        int number = 5;
        int factorial = factorial(number);

        System.out.println("The factorial of " + number + " is " + factorial);
    }
}

