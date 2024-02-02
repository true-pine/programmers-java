package org.example.training.day4;

/**
 * flag에 따라 다른 값 반환하기
 */
public class Ex5 {
    public static int solution(int a, int b, boolean flag) {
        return flag ? a + b : a - b;
    }

    public static void main(String[] args) {
        System.out.println(solution(-4, 7, true));
    }
}
