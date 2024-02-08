package org.example.training.day11;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * 카운트 다운
 */
public class Ex4 {
    public static int[] solution1(int start, int end_num) {
        int[] answer = new int[start - end_num + 1];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = start--;
        }
        return answer;
    }

    public static int[] solution2(int start, int end_num) {     // stream을 이용한 풀이
        return IntStream.iterate(start, n -> n - 1).limit(start - end_num + 1).toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution2(10, 3)));
    }
}
