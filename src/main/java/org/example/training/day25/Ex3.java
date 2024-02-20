package org.example.training.day25;

import java.util.Arrays;

/**
 * 정사각형으로 만들기
 */
public class Ex3 {
    public static int[][] solution1(int[][] arr) {
        int length = Math.max(arr.length, arr[0].length);

        int[][] answer = new int[length][length];

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                answer[i][j] = arr[i][j];
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(solution1(new int[][]{{1, 2}, {3, 4}})));
    }
}
