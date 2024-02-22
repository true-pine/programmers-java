package org.example.beginner.day4;

/**
 * 피자 나눠 먹기 (1)
 */
public class Ex1 {
    public static int solution1(int n) {
        return n % 7 == 0 ? n / 7 : n / 7 + 1;
    }

    public static void main(String[] args) {
        System.out.println(solution1(15));
    }
}
