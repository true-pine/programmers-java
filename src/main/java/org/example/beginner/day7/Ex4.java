package org.example.beginner.day7;

import java.util.stream.IntStream;

/**
 * 짝수의 합
 */
public class Ex4 {
    public static int solution1(int n) {
        return IntStream.rangeClosed(0, n).filter(i -> i % 2 == 0).sum();
    }

    public static void main(String[] args) {
        System.out.println(solution1(10));
    }
}
