package org.example.beginner.day12;

import java.util.Arrays;

/**
 * 숨어있는 숫자의 덧셈 (1)
 */
public class Ex3 {
    public static int solution1(String my_string) {
        return Arrays.stream(my_string.replaceAll("[^0-9]", "").split(""))
                .mapToInt(Integer::parseInt)
                .sum();
    }

    public static void main(String[] args) {
        System.out.println(solution1("aAb1B2cC34oOp"));
    }
}
