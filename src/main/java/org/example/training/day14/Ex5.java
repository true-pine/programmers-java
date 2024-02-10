package org.example.training.day14;

import java.util.Arrays;

/**
 * 수열과 구간 쿼리 1
 */
public class Ex5 {
    public static int[] solution1(int[] arr, int[][] queries) {
        for(int[] query : queries) {
            for(int i = query[0]; i <= query[1]; i++) {
                arr[i]++;
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution1(new int[]{0, 1, 2, 3, 4}, new int[][]{{0, 1}, {1, 2}, {2, 3}})));
    }
}
