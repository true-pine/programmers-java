package org.example.training.day16;

/**
 * 소문자로 바꾸기
 */
public class Ex2 {
    public static String solution1(String myString) {
        return myString.toLowerCase();
    }

    public static void main(String[] args) {
        System.out.println(solution1("aBcDeFg"));
    }
}
