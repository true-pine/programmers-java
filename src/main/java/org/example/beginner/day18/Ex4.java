package org.example.beginner.day18;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * 문자열 정렬하기 (2)
 */
public class Ex4 {
    public static String solution1(String my_string) {
        return Arrays.stream(my_string.toLowerCase().split("")).sorted().collect(Collectors.joining());
    }

    public static void main(String[] args) {
        System.out.println(solution1("Bcad"));
    }
}
