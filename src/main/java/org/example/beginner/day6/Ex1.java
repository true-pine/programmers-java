package org.example.beginner.day6;

/**
 * 문자열 뒤집기
 */
public class Ex1 {
    public static String solution1(String my_string) {
        return new StringBuilder(my_string).reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(solution1("jaron"));
    }
}
