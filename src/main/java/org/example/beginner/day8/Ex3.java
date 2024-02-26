package org.example.beginner.day8;

import java.util.Arrays;

/**
 * 진료순서 정하기
 */
public class Ex3 {
    public static int[] solution1(int[] emergency) {
        int[] answer = new int[emergency.length];

        int[] copy = Arrays.copyOf(emergency, emergency.length);
        Arrays.sort(copy);

        for (int i = 0, cnt = 1; i < copy.length; i++) {
            answer[findIndex(emergency, copy[i])] = cnt++;
        }

        return answer;
    }

    private static int findIndex(int[] arr, int num) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == num)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution1(new int[]{1, 2, 3, 4, 5, 6, 7})));
    }
}
