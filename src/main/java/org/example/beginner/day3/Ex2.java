package org.example.beginner.day3;

import java.util.Arrays;

/**
 * 중앙값 구하기
 */
public class Ex2 {
    public static int solution1(int[] array) {
        return Arrays.stream(array).sorted().toArray()[array.length / 2];
    }

    public static void main(String[] args) {
        System.out.println(solution1(new int[]{1,2,7,10,11}));
    }
}
