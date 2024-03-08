package org.example.beginner.day13;

import java.util.Arrays;

/**
 * 삼각형의 완성조건 (1)
 */
public class Ex4 {
    public static int solution1(int[] sides) {
        Arrays.sort(sides);

        return (sides[0] + sides[1]) > sides[2] ? 1 : 2;
    }

    public static void main(String[] args) {
        System.out.println(solution1(new int[]{1,2,3}));
    }
}
