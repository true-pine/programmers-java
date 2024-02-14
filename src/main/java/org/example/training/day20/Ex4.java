package org.example.training.day20;

import java.util.Arrays;

/**
 * 배열의 길이에 따라 다른 연산하기
 */
public class Ex4 {
    public static int[] solution1(int[] arr, int n) {
        if(arr.length % 2 == 0) {
            for(int i = 1; i < arr.length; i += 2)
                arr[i] += n;
        } else {
            for(int i = 0; i < arr.length; i += 2)
                arr[i] += n;
        }

        return arr;
    }

    public static int[] solution2(int[] arr, int n) {   // 위 풀이 요약
        for(int i = arr.length % 2 == 0 ? 1 : 0; i < arr.length; i += 2)
            arr[i] += n;

        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution1(new int[]{49, 12, 100, 276, 33}, 27)));
    }
}
