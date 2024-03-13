package org.example.beginner.day18;

/**
 * 문자열안에 문자열
 */
public class Ex1 {
    public static int solution1(String str1, String str2) {
        return str1.contains(str2) ? 1 : 2;
    }

    public static void main(String[] args) {
        System.out.println(solution1("ppprrrogrammers", "pppp"));
    }
}
