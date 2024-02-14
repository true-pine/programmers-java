package org.example.training.day20;

import java.util.Arrays;

/**
 * 뒤에서 5등까지
 */
public class Ex5 {
    public static int[] solution1(int[] num_list) {
        Arrays.sort(num_list);
        return Arrays.copyOfRange(num_list, 0, 5);
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution1(new int[]{12, 4, 15, 46, 38, 1, 14})));
    }
}
