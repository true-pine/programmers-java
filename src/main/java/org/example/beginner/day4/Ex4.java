package org.example.beginner.day4;

import java.util.Arrays;

/**
 * 배열의 평균값
 */
public class Ex4 {
    public static double solution1(int[] numbers) {
        return Arrays.stream(numbers).mapToDouble(i -> (double) i).sum() / numbers.length;
    }

    public static void main(String[] args) {
        System.out.println(solution1(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
    }
}
