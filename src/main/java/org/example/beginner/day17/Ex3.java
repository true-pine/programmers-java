package org.example.beginner.day17;

import java.util.Arrays;

/**
 * 자릿수 더하기
 */
public class Ex3 {
    public static int solution1(int n) {
        return Arrays.stream(String.valueOf(n).split("")).mapToInt(Integer::parseInt).sum();
    }

    public static void main(String[] args) {
        System.out.println(solution1(1234));
    }
}
