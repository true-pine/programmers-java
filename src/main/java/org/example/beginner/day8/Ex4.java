package org.example.beginner.day8;

import java.util.stream.IntStream;

/**
 * 순서쌍의 개수
 */
public class Ex4 {
    public static int solution1(int n) {    // for-loop
        int count = 0;

        for(int i = 1; i <= n; i++) {
            if(n % i == 0)
                count++;
        }

        return count;
    }

    public static int solution2(int n) {    // stream
        return (int) IntStream.rangeClosed(1, n).filter(i -> n % i == 0).count();
    }

    public static void main(String[] args) {
        System.out.println(solution1(20));
    }
}
