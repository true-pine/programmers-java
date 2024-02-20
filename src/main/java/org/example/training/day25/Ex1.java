package org.example.training.day25;

import java.util.Arrays;

/**
 * 정수를 나선형으로 배치하기
 */
public class Ex1 {
    public static int[][] solution1(int n) {
        int[][] answer = new int[n][n];

        int num = 1;
        int i = 0;
        int j = 0;
        char dir = 'r';

        while(num <= n * n) {
            answer[i][j] = num++;

            switch(dir) {
                case 'r':
                    if(j == n - (i + 1)) {
                        i++;
                        dir = 'd';
                    } else {
                        j++;
                    }
                    break;
                case 'd':
                    if(i == j) {
                        j--;
                        dir = 'l';
                    } else {
                        i++;
                    }
                    break;
                case 'l':
                    if(j == n - (i + 1)) {
                        i--;
                        dir = 'u';
                    } else {
                        j--;
                    }
                    break;
                case 'u':
                    if(i == j + 1) {
                        j++;
                        dir = 'r';
                    } else {
                        i--;
                    }
                    break;
                default:
                    break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(solution1(4)));
    }
}
