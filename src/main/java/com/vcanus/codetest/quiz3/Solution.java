package com.vcanus.codetest.quiz3;

public class Solution {
    public static void main(String[] args) {
        System.out.println("factorial(4) is = " + factorial(4));
    }

    private static int factorial(final int depth) {
        return depth == 1
                ? depth
                : depth * factorial(depth - 1);
    }
}
