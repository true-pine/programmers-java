package org.example.beginner.day17;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * n의 배수 고르기
 */
public class Ex2 {
    public static int[] solution1(int n, int[] numlist) {
        ArrayList<Integer> list = new ArrayList<>();

        for(int num : numlist) {
            if(num % n == 0)
                list.add(num);
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    public static int[] solution2(int n, int[] numlist) {
        return Arrays.stream(numlist).filter(num -> num % n == 0).toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution1(3, new int[]{4, 5, 6, 7, 8, 9, 10, 11, 12})));
    }
}
