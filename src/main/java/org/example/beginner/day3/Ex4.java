package org.example.beginner.day3;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * 짝수는 싫어요
 */
public class Ex4 {
    public static int[] solution1(int n) {
        int[] answer = new int[n % 2 == 0 ? n / 2 : n / 2 + 1];

        for(int i = 1, j = 0; i <= n; i += 2) {
            answer[j++] = i;
        }

        return answer;
    }

    public static int[] solution2(int n) {
        return IntStream.iterate(1, i -> i + 2).limit(n % 2 == 0 ? n / 2 : n / 2 + 1).toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution2(15)));
    }
}
