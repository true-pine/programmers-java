package org.example.beginner.day19;

import java.util.Arrays;

/**
 * 머쓱이보다 키 큰 사람
 */
public class Ex4 {
    public static int solution1(int[] array, int height) {
        int answer = 0;

        for(int i : array)
            if(i > height)
                answer++;

        return answer;
    }

    public static int solution2(int[] array, int height) {      // stream
        return (int) Arrays.stream(array).filter(i -> i > height).count();
    }

    public static void main(String[] args) {
        System.out.println(solution1(new int[]{149, 180, 192, 170}, 167));
    }
}
