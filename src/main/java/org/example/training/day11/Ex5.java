package org.example.training.day11;

import java.util.stream.IntStream;

/**
 * 가까운 1 찾기
 */
public class Ex5 {
    public static int solution1(int[] arr, int idx) {
        int answer = -1;

        for(int i = idx; i < arr.length; i++) {
            if(arr[i] == 1) {
                answer = i;
                break;
            }
        }

        return answer;
    }

    public static int solution2(int[] arr, int idx) {   // stream을 이용한 풀이
        return IntStream.range(idx, arr.length)
                .filter(i -> arr[i] == 1)
                .findFirst()
                .orElse(-1);
    }

    public static void main(String[] args) {
        System.out.println(solution2(new int[]{1, 0, 0, 1, 0, 0}, 4));
    }
}
