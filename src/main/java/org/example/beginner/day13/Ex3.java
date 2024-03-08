package org.example.beginner.day13;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * 중복된 문자 제거
 */
public class Ex3 {
    public static String solution1(String my_string) {
        return Arrays.stream(my_string.split("")).distinct().collect(Collectors.joining());
    }

    public static void main(String[] args) {
        System.out.println(solution1("people"));
    }
}
