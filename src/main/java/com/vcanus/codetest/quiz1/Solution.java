package com.vcanus.codetest.quiz1;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Solution {

    public static void main(String[] args) {
        Arrays.stream(BreadType.values())
                .map(BreadType::newBread)
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}
