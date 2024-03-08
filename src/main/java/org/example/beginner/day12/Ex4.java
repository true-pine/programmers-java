package org.example.beginner.day12;

import java.util.Arrays;
import java.util.HashSet;

/**
 * 소인수분해
 */
public class Ex4 {
    public static int[] solution1(int n) {
        HashSet<Integer> set = new HashSet<>();

        int i = 2;
        while (n != 1) {
            if(n % i == 0) {
                set.add(i);
                n /= i;
            } else {
                i++;
            }
        }

        return set.stream().mapToInt(Integer::intValue).sorted().toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution1(420)));
    }
}
