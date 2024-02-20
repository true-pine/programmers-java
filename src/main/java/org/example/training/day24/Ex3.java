package org.example.training.day24;

import java.util.Arrays;

/**
 * 조건에 맞게 수열 변환하기 3
 */
public class Ex3 {
    public static int[] solution1(int[] arr, int k) {
        if(k % 2 == 0) {
            for(int i = 0; i < arr.length; i++)
                arr[i] += k;
        } else {
            for(int i = 0; i < arr.length; i++)
                arr[i] *= k;
        }

        return arr;
    }

    public static int[] solution2(int[] arr, int k) {   // stream
        return Arrays.stream(arr).map(i -> k % 2 == 0 ? i + k : i * k).toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution2(new int[]{1, 2, 3, 100, 99, 98}, 3)));
    }
}
