package org.example.training.day4;

/**
 * 공배수
 */
public class Ex2 {
    public static int solution1(int number, int n, int m) {
        if (number % n == 0 && number % m == 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public static int solution2(int number, int n, int m) {     // 한줄 코딩
        return number % n == 0 && number % m == 0 ? 1 : 0;
    }

    public static void main(String[] args) {
        System.out.println(solution2(60, 2, 3));
    }
}
