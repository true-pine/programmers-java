package org.example.beginner.day8;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * 배열 자르기
 */
public class Ex1 {
    public static int[] solution1(int[] numbers, int num1, int num2) {
        return IntStream.rangeClosed(num1, num2).map(i -> numbers[i]).toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution1(new int[]{1, 2, 3, 4, 5}, 1, 3)));
    }
}
