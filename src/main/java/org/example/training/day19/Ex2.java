package org.example.training.day19;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 배열의 원소만큼 추가하기
 */
public class Ex2 {
    public static int[] solution1(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();

        for(int n : arr) {
            for(int i = 0; i < n; i++) {
                list.add(n);
            }
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution1(new int[]{5, 1, 4})));
    }
}
