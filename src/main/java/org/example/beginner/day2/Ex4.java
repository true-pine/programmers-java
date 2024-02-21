package org.example.beginner.day2;

import java.util.Arrays;

/**
 * 배열 두 배 만들기
 */
public class Ex4 {
    public static int[] solution1(int[] numbers) {  // for-loop
        for(int i = 0; i < numbers.length; i++) {
            numbers[i] *= 2;
        }
        return numbers;
    }

    public static int[] solution2(int[] numbers) {  // stream
        return Arrays.stream(numbers).map(i -> i * 2).toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution1(new int[]{1, 2, 3, 4, 5})));
    }
}
