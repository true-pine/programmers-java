package org.example.beginner.day18;

/**
 * 세균 증식
 */
public class Ex3 {
    public static int solution1(int n, int t) {
        return n * (int) Math.pow(2, t);
    }

    public static void main(String[] args) {
        System.out.println(solution1(2, 10));
    }
}
