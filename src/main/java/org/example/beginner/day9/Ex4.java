package org.example.beginner.day9;

import java.math.BigInteger;

/**
 * 구슬을 나누는 경우의 수
 */
public class Ex4 {
    public static int solution1(int balls, int share) {
        long a = 1;

        for(int i = 1; i <= share; i++) {
            a *= balls--;
            a /= i;
        }

        return (int) a;
    }

    public static void main(String[] args) {
        System.out.println(solution1(3, 2));
    }
}
