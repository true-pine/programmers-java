package org.example.training.day13;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * n개 간격의 원소들
 */
public class Ex5 {
    public static int[] solution1(int[] num_list, int n) {  // stream
        return IntStream.range(0, num_list.length)
                .filter(idx -> idx % n == 0)
                .map(idx -> num_list[idx])
                .toArray();
    }

    public static int[] solution2(int[] num_list, int n) {  // for-loop
        int length = num_list.length % n == 0 ? num_list.length / n : num_list.length / n + 1;
        int[] answer = new int[length];

        for (int i = 0, idx = 0; i < num_list.length; i += n) {
            answer[idx++] = num_list[i];
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution2(new int[]{4, 2, 6, 1, 7, 6}, 2)));
    }
}
