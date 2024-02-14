package org.example.training.day21;

import java.util.Arrays;

/**
 * 뒤에서 5등 위로
 */
public class Ex1 {
    public static int[] solution1(int[] num_list) {
        Arrays.sort(num_list);
        return Arrays.copyOfRange(num_list, 5, num_list.length);
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution1(new int[]{12, 4, 15, 46, 38, 1, 14, 56, 32, 10})));
    }
}
