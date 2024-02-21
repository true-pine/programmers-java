package org.example.beginner.day2;

/**
 * 두 수의 나눗셈
 */
public class Ex1 {
    public static int solution1(int num1, int num2) {
        return (int) (((double) num1 / (double) num2) * 1000);
    }

    public static void main(String[] args) {
        System.out.println(solution1(3, 2));
    }
}
