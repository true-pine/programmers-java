package org.example.beginner.day15;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * 약수 구하기
 */
public class Ex4 {
    public static int[] solution1(int n) {
        return IntStream.rangeClosed(1, n).filter(i -> n % i == 0).toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution1(24)));
    }
}
