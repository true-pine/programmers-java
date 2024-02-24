package org.example.beginner.day7;

/**
 * 특정 문자 제거하기
 */
public class Ex1 {
    public static String solution1(String my_string, String letter) {
        return my_string.replace(letter, "");
    }

    public static void main(String[] args) {
        System.out.println(solution1("abcdef", "f"));
    }
}
