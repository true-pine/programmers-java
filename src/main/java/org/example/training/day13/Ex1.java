package org.example.training.day13;

import java.util.Arrays;

/**
 * n 번째 원소부터
 */
public class Ex1 {
    public static int[] solution1(int[] num_list, int n) {
        int[] answer = new int[num_list.length - (n - 1)];
        for(int i = n - 1, idx = 0; i < num_list.length; i++) {
            answer[idx++] = num_list[i];
        }
        return answer;
    }

    public static int[] solution2(int[] num_list, int n) {      // Arrays 클래스를 이용한 풀이
        return Arrays.copyOfRange(num_list, n - 1, num_list.length);
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution2(new int[]{2, 1, 6}, 3)));
    }
}
