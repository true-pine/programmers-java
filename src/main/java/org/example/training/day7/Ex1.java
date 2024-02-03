package org.example.training.day7;

import java.util.Arrays;

/**
 * 수열과 구간 쿼리 4
 */
public class Ex1 {
    public static int[] solution1(int[] arr, int[][] queries) {
        int[] answer = Arrays.copyOf(arr, arr.length);

        for(int[] query : queries) {
            for(int i = query[0]; i <= query[1]; i++) {
                if(i % query[2] == 0) {
                    answer[i] += 1;
                }
            }
        }

        return answer;
    }

    public static int[] solution2(int[] arr, int[][] queries) {     // 간소화한 풀이
        for (int i = 0; i < queries.length; i++) {
            for (int j = queries[i][0]; j <= queries[i][1]; j++) {
                if(j % queries[i][2] == 0) arr[j] += 1;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution1(new int[]{0, 1, 2, 4, 3}, new int[][]{{0, 4, 1}, {0, 3, 2}, {0, 3, 3}})));
    }
}
