package org.example.training.day12;

import java.util.Arrays;

/**
 * 배열 만들기 3
 */
public class Ex3 {
    public static int[] solution1(int[] arr, int[][] intervals) {
        int length1 = intervals[0][1] - intervals[0][0] + 1;
        int length2 = intervals[1][1] - intervals[1][0] + 1;

        int[] answer = new int[length1 + length2];
        System.arraycopy(arr, intervals[0][0], answer, 0, length1);
        System.arraycopy(arr, intervals[1][0], answer, length1, length2);

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution1(new int[]{1, 2, 3, 4, 5}, new int[][]{{1, 3}, {0, 4}})));
    }
}
