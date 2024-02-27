package org.example.beginner.day10;

import java.util.Arrays;

/**
 * 2차원으로 만들기
 */
public class Ex2 {
    public static int[][] solution1(int[] num_list, int n) {
        int y = num_list.length / n;

        int[][] answer = new int[y][n];
        int idx = 0;

        for(int i = 0; i < answer.length; i++)
            for(int j = 0; j < answer[i].length; j++)
                answer[i][j] = num_list[idx++];

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(solution1(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, 2)));
    }
}
