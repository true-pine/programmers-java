package org.example.beginner.day18;

/**
 * 제곱수 판별하기
 */
public class Ex2 {
    public static int solution1(int n) {
        return Math.sqrt(n) % 1 == 0 ? 1 : 2;
    }

    public static void main(String[] args) {
        System.out.println(solution1(144));
    }
}
