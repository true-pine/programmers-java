package org.example.training.day15;

import java.util.Arrays;

/**
 * 조건에 맞게 수열 변환하기 2
 */
public class Ex2 {
    public static int solution1(int[] arr) {
        int[] after = Arrays.copyOf(arr, arr.length);
        arr(after);

        int count = 0;

        while(!Arrays.equals(arr, after)) {
            arr(arr);
            arr(after);
            count++;
        }

        return count;
    }

    private static void arr(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] >= 50 && arr[i] % 2 == 0) {
                arr[i] = arr[i] / 2;
            } else if(arr[i] < 50 && arr[i] % 2 != 0) {
                arr[i] = arr[i] * 2 + 1;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(solution1(new int[]{63}));
    }
}
