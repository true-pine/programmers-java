package org.example.beginner.day4;

/**
 * 피자 나눠 먹기 (3)
 */
public class Ex3 {
    public static int solution1(int slice, int n) {
        return (n / slice) + (n % slice == 0 ? 0 : 1);
    }

    public static void main(String[] args) {
        System.out.println(solution1(7, 10));
    }
}
