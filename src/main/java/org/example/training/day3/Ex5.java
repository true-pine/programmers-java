package org.example.training.day3;

/**
 * 두 수의 연산값 비교하기
 */
public class Ex5 {
    public static int solution(int a, int b) {
        return Math.max(Integer.parseInt(a + "" + b), 2 * a * b);
    }

    public static void main(String[] args) {
        System.out.println(solution(2, 91));
    }
}
