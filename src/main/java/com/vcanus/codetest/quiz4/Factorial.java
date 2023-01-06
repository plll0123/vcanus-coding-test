package com.vcanus.codetest.quiz4;

public class Factorial {

    public static void main(String[] args) {
        System.out.println(factorial(1_000_000));
    }

    private static int factorial(int n) {
        int factorial = 1;
        while(n > 1){
            factorial *= n;
            n--;
        }
        return factorial;
    }

}
