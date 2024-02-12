package org.example.training.day19;

import java.util.Arrays;

/**
 * 무작위로 K개의 수 뽑기
 */
public class Ex5 {
    public static int[] solution1(int[] arr, int k) {
        int[] answer = new int[k];
        Arrays.fill(answer, -1);

        int idx = 0;
        for(int num : arr) {
            boolean include = false;

            for(int value : answer) {
                if(num == value) {
                    include = true;
                    break;
                }
            }

            if(!include && idx < answer.length) {
                answer[idx++] = num;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution1(new int[]{0, 1, 1, 2, 2, 3}, 3)));
    }
}
