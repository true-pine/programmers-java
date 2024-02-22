package org.example.beginner.day4;

/**
 * 피나 나눠 먹기 (2)
 */
public class Ex2 {
    public static int solution1(int n) {
        if(n % 6 == 0)
            return n / 6;

        if(n % 2 == 0) {
            return n / 2;
        } else {
            return n % 3 == 0 ? n / 3 : n;
        }
    }

    public static int solution2(int n) {
        int answer = 1;

        while (6 * answer % n != 0) {
            answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution1(10));
    }
}
