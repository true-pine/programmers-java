package org.example.beginner.day10;

import java.util.Arrays;

/**
 * 배열 회전시키기
 */
public class Ex4 {
    public static int[] solution1(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];

        int j = direction.equals("right") ? 1 : answer.length - 1;

        for(int i = 0; i < numbers.length; i++)
            answer[j++ % answer.length] = numbers[i];

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution1(new int[]{1, 2, 3}, "right")));
    }
}
