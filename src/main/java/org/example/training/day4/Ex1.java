package org.example.training.day4;

/**
 * n의 배수
 */
public class Ex1 {
    public static int solution(int num, int n) {
        return num % n == 0 ? 1 : 0;
    }

    public static void main(String[] args) {
        System.out.println(solution(98, 2));
    }
}
