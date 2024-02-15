package org.example.training.day23;

/**
 * 부분 문자열
 */
public class Ex1 {
    public static int solution1(String str1, String str2) {
        return str2.contains(str1) ? 1 : 0;
    }

    public static void main(String[] args) {
        System.out.println(solution1("abc", "aabcc"));
    }
}
