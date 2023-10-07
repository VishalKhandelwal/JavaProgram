package com.vk.program;

import java.util.stream.LongStream;

public class FactorialUsingStreamAPI {
    public static void main(String[] args) {
        int number = 5;

        long factorial = LongStream.rangeClosed(1, number)
                .reduce(1L, (a, b) -> a * b);

        System.out.println("The factorial of " + number + " is " + factorial);
    }
}
