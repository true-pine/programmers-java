package org.example.training.day23;

import java.util.Arrays;

/**
 * 정수 찾기
 */
public class Ex3 {
    public static int solution1(int[] num_list, int n) {    // for-loop
        int answer = 0;

        for(int num : num_list) {
            if(num == n) {
                answer = 1;
                break;
            }
        }

        return answer;
    }

    public static int solution2(int[] num_list, int n) {    // stream
        return Arrays.stream(num_list).anyMatch(num -> num == n) ? 1 : 0;
    }

    public static void main(String[] args) {
        System.out.println(solution1(new int[]{1,2,3,4,5}, 3));
    }
}
