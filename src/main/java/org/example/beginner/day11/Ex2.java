package org.example.beginner.day11;

/**
 * 합성수 찾기
 */
public class Ex2 {
    public static int solution1(int n) {
        int answer = 0;

        for(int i = 4; i <= n; i++) {
            int cnt = 0;
            for(int j = 1; j <= i; j++)
                if(i % j == 0) cnt++;
            if(cnt >= 3) answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution1(15));
    }
}
