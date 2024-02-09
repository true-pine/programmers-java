package org.example.training.day13;

import java.util.Arrays;

/**
 * n 번째 원소까지
 */
public class Ex4 {
    public static int[] solution1(int[] num_list, int n) {      // stream
        return Arrays.stream(num_list, 0, n).toArray();
    }

    public static int[] solution2(int[] num_list, int n) {      // for-loop
        int[] answer = new int[n];
        for(int i = 0; i < n; i++) {
            answer[i] = num_list[i];
        }
        return answer;
    }

    public static int[] solution3(int[] num_list, int n) {      // array copy
        return Arrays.copyOfRange(num_list, 0, n);
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution3(new int[]{2, 1, 6}, 1)));
    }
}
