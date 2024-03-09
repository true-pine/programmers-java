package org.example.beginner.day14;

import java.util.Arrays;

/**
 * 가까운 수
 */
public class Ex1 {
    public static int solution1(int[] array, int n) {
        Arrays.sort(array);

        int answer = array[0];
        for(int i = 1; i < array.length; i++) {
            if(Math.abs(answer - n) > Math.abs(array[i] - n))
                answer = array[i];
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution1(new int[]{10,11,12}, 13));
    }
}
