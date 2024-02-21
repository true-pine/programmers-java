package org.example.beginner.day2;

/**
 * 숫자 비교하기
 */
public class Ex2 {
    public static int solution1(int num1, int num2) {
        return num1 == num2 ? 1 : -1;
    }

    public static void main(String[] args) {
        System.out.println(solution1(2, 3));
    }
}
