package org.example.beginner.day16;

import java.util.Arrays;

/**
 * 가장 큰 수 찾기
 */
public class Ex2 {
    public static int[] solution1(int[] array) {
        int[] answer = new int[2];

        answer[0] = Arrays.stream(array).max().getAsInt();
        for(int i = 0; i < array.length; i++)
            if(array[i] == answer[0]) {
                answer[1] = i;
                break;
            }

        return answer;
    }

    public static int[] solution2(int[] array) {    // best
        int[] answer = new int[2];

        for(int i=0;i<array.length;i++) {
            if(array[i] > answer[0]) {
                answer[0] = array[i];
                answer[1] = i;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution1(new int[]{1, 8, 3})));
    }
}
