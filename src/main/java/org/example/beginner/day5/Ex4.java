package org.example.beginner.day5;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * 배열 뒤집기
 */
public class Ex4 {
    public static int[] solution1(int[] num_list) {     // for-loop
        int[] answer = new int[num_list.length];

        for(int i = num_list.length - 1, j = 0; i >= 0; i--) {
            answer[j++] = num_list[i];
        }

        return answer;
    }

    public static int[] solution2(int[] num_list) {     // stream
        return IntStream.iterate(num_list.length - 1, i -> i - 1).limit(num_list.length).map(i -> num_list[i]).toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution2(new int[]{1, 2, 3, 4, 5})));
    }
}
