package org.example.beginner.day7;

/**
 * 양꼬치
 */
public class Ex3 {
    public static int solution1(int n, int k) {
        return 12000 * n + 2000 * (k - (n / 10));
    }

    public static void main(String[] args) {
        System.out.println(solution1(64, 6));
        System.out.println(solution1(30, 0));
    }
}
