package org.example.training.day20;

import java.util.Arrays;

/**
 * 배열의 길이를 2의 거듭제곱으로 만들기
 */
public class Ex1 {
    public static int[] solution1(int[] arr) {
        int[] answer;

        int i = 0;
        while(true) {
            int length = (int) Math.pow(2, i++);
            if(arr.length <= length) {
                answer = Arrays.copyOf(arr, length);
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution1(new int[]{1, 2, 3, 4, 5, 6})));
    }
}
