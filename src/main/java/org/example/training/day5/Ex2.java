package org.example.training.day5;

import java.util.stream.IntStream;

/**
 * 등차수열의 특정한 항만 더하기
 */
public class Ex2 {
    public static int solution(int a, int d, boolean[] included) {
        int[] numbers = IntStream.iterate(a, n -> n + d).limit(included.length).toArray();

        int result = 0;

        for(int i = 0; i < included.length; i++) {
            result += included[i] ? numbers[i] : 0;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(solution(3, 4, new boolean[]{true, false, false, true, true}));
    }
}
