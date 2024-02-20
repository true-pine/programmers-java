package org.example.training.day24;

import java.util.Arrays;

/**
 * 특이한 이차원 배열 1
 */
public class Ex5 {
    public static int[][] solution1(int n) {    // double loop
        int[][] answer = new int[n][n];

        for(int i = 0; i < answer.length; i++) {
            for(int j = 0; j < answer[i].length; j++)
                if(i == j) answer[i][j] = 1;
        }

        return answer;
    }

    public static int[][] solution2(int n) {    // single loop
        int[][] answer = new int[n][n];

        for(int i = 0; i < n; i++)
            answer[i][i] = 1;

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(solution1(3)));
    }
}
