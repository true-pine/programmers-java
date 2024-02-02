package org.example.training.day4;

import java.util.stream.IntStream;

/**
 * 홀짝에 따라 다른 값 반환하기
 */
public class Ex3 {
    public static int solution1(int n) {
        int result = 0;

        if(n % 2 == 0) {
            for (int i = n; i >= 0; i -= 2) {
                result += (i * i);
            }
        } else {
            for (int i = n; i >= 0; i -= 2) {
                result += i;
            }
        }

        return result;
    }

    public static int solution2(int n) {    // 무한스트림을 이용한 풀이
        if(n % 2 == 0) {
            return IntStream.iterate(2, e -> e + 2).limit(n / 2).map(e -> e * e).sum();
        } else {
            return IntStream.iterate(1, e -> e + 2).limit((n + 1) / 2).sum();
        }
    }

    public static void main(String[] args) {
        System.out.println(solution2(10));
    }
}
