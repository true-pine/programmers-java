package org.example.training.day16;

/**
 * 대문자로 바꾸기
 */
public class Ex1 {
    public static String solution1(String myString) {
        return myString.toUpperCase();
    }

    public static void main(String[] args) {
        System.out.println(solution1("aBcDeFg"));
    }
}
