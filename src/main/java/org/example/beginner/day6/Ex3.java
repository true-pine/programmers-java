package org.example.beginner.day6;

import java.util.Arrays;

/**
 * 짝수 홀수 개수
 */
public class Ex3 {
    public static int[] solution1(int[] num_list) {
        int odd = 0, even = 0;

        for(int num : num_list) {
            if(num % 2 == 0)
                even++;
            else
                odd++;
        }

        return new int[]{even, odd};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution1(new int[]{1, 2, 3, 4, 5})));
    }
}
