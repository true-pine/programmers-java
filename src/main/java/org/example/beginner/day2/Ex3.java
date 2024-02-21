package org.example.beginner.day2;

import java.util.Arrays;

/**
 * 분수의 덧셈
 */
public class Ex3 {
    public static int[] solution1(int numer1, int denom1, int numer2, int denom2) {
        int numer = (numer1 * denom2) + (numer2 * denom1);
        int denom = denom1 * denom2;

        if(numer > denom) {
            return new int[]{numer / calc(numer, denom), denom / calc(numer, denom)};
        } else {
            return new int[]{numer / calc(denom, numer), denom / calc(denom, numer)};
        }
    }

    private static int calc(int big, int small) {
        while(true) {
            int temp = big % small;

            if(temp == 0)
                break;

            big = small;
            small = temp;
        }

        return small;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution1(1, 2, 3, 4)));
    }
}
