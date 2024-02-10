package org.example.training.day15;

import java.util.Arrays;

/**
 * 조건에 맞게 수열 변환하기 1
 */
public class Ex1 {
    public static int[] solution1(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] >= 50 && arr[i] % 2 == 0) {
                arr[i] /= 2;
            } else if(arr[i] < 50 && arr[i] % 2 != 0) {
                arr[i] *= 2;
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution1(new int[]{1, 2, 3, 100, 99, 98})));
    }
}
