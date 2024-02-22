package org.example.beginner.day5;

import java.util.Arrays;

/**
 * 아이스 아메리카노
 */
public class Ex2 {
    public static int[] solution1(int money) {
        return new int[]{money / 5500, money % 5500};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution1(5500)));
    }
}
