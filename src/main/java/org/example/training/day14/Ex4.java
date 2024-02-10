package org.example.training.day14;

/**
 * n보다 커질 때까지 더하기
 */
public class Ex4 {
    public static int solution1(int[] numbers, int n) {
        int answer = 0;

        for(int number : numbers) {
            answer += number;
            if(answer > n) break;
        }

        return answer;
    }

    public static int solution2(int[] numbers, int n) {
        int answer = 0;

        for(int i = 0; answer <= n; i++) {
            answer += numbers[i];
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution2(new int[]{34, 5, 71, 29, 100, 34}, 123));
    }
}
