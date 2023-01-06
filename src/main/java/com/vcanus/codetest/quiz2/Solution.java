package com.vcanus.codetest.quiz2;

import java.util.function.Supplier;

public class Solution {

    public static void main(String[] args) {
        print(() -> new Calculator.CalculatorBuilder().add(4).add(5).subtract(3).out());
        print(() -> new Calculator.CalculatorBuilder(4).add(5).subtract(3).out());
    }

    private static void print(Supplier<Integer> result) {
        System.out.println("result is = " + result.get());
    }
}
