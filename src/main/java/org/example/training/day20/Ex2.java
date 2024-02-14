package org.example.training.day20;

import java.util.Arrays;

/**
 * 배열 비교하기
 */
public class Ex2 {
    public static int solution1(int[] arr1, int[] arr2) {
        if(arr1.length != arr2.length) {
            return arr1.length > arr2.length ? 1 : -1;
        } else {
            int sum1 = Arrays.stream(arr1).sum();
            int sum2 = Arrays.stream(arr2).sum();
            return sum1 == sum2 ? 0 : sum1 > sum2 ? 1 : -1;
//            return Integer.compare(sum1, sum2);
        }
    }

    public static void main(String[] args) {
        System.out.println(solution1(new int[]{100, 17, 84, 1}, new int[]{55, 12, 65, 36}));
    }
}
