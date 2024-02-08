package org.example.training.day10;

/**
 * 문자열의 앞의 n글자
 */
public class Ex1 {
    public static String solution1(String my_string, int n) {
        return my_string.substring(0, n);
    }

    public static void main(String[] args) {
        System.out.println(solution1("ProgrammerS123", 11));
    }
}
