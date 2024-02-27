package org.example.beginner.day11;

/**
 * 팩토리얼
 */
public class Ex4 {
    public static int solution1(int n) {
        int answer = n;

        for(int i = 1; i <= n; i++)
            if(factorial(i) > n) {
                answer = i - 1;
                break;
            }

        return answer;
    }

    private static int factorial(int n) {
        if(n == 1) return 1;
        return n * factorial(n - 1);
    }

    public static int solution2(int n) {    // method 생성없는 풀이
        int factorial = 1;
        int calc = 1;

        while(calc <= n) {
            calc *= ++factorial;
        }

        return factorial - 1;
    }

    public static void main(String[] args) {
        System.out.println(solution2(7));
    }
}
