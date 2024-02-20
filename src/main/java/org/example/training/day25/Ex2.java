package org.example.training.day25;

/**
 * 특별한 이차원 배열 2
 */
public class Ex2 {
    public static int solution1(int[][] arr) {
        int answer = 1;

        outer_loop:
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] != arr[j][i]) {
                    answer = 0;
                    break outer_loop;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution1(new int[][]{{5, 192, 33}, {192, 72, 95}, {33, 95, 999}}));
    }
}
