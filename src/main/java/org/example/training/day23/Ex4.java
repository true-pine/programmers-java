package org.example.training.day23;

/**
 * 주사위 게임 1
 */
public class Ex4 {
    public static int solution1(int a, int b) {
        int answer = 0;

        if(a % 2 != 0 && b % 2 != 0)
            answer = a * a + b * b;
        else if(a % 2 != 0 || b % 2 != 0)
            answer = 2 * (a + b);
        else
            answer = Math.abs(a - b);

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution1(3, 5));
    }
}
