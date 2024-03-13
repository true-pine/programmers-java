package org.example.beginner.day19;

import java.util.Arrays;

/**
 * 중복된 숫자 개수
 */
public class Ex3 {
    public static int solution1(int[] array, int n) {
        int answer = 0;

        for(int i : array)
            if(i == n)
                answer++;

        return answer;
    }

    public static int solution2(int[] array, int n) {   // stream
        return (int) Arrays.stream(array).filter(i -> i == n).count();
    }

    public static void main(String[] args) {
        System.out.println(solution2(new int[]{1, 1, 2, 3, 4, 5}, 1));
    }
}
