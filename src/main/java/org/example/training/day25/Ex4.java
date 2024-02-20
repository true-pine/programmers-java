package org.example.training.day25;

/**
 * 이차원 배열 대각선 순회하기
 */
public class Ex4 {
    public static int solution1(int[][] board, int k) {
        int answer = 0;

        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[i].length; j++) {
                if(i + j <= k)
                    answer += board[i][j];
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution1(new int[][]{{0,1,2}, {1,2,3}, {2,3,4}, {3,4,5}}, 2));
    }
}
