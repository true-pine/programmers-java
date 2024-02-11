package org.example.training.day17;

import java.util.Arrays;

/**
 * 공백으로 구분하기 1
 */
public class Ex4 {
    public static String[] solution1(String my_string) {
        return my_string.split(" ");
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution1("i love you")));
    }
}
