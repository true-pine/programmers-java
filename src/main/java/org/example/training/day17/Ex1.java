package org.example.training.day17;

/**
 * 특정 문자열로 끝나는 가징 긴 부분 문자열 찾기
 */
public class Ex1 {
    public static String solution1(String myString, String pat) {
        return myString.substring(0, myString.lastIndexOf(pat) + pat.length());
    }

    public static void main(String[] args) {
        System.out.println(solution1("AbCdEFG", "dE"));
    }
}
