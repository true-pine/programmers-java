package org.example.beginner.day12;

/**
 * 모음 제거
 */
public class Ex1 {
    public static String solution1(String my_string) {
        return my_string.replaceAll("[aeiou]", "");
    }

    public static void main(String[] args) {
        System.out.println(solution1("nice to meet you"));
    }
}
