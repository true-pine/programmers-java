package org.example.training.day24;

/**
 * l로 만들기
 */
public class Ex4 {
    public static String solution1(String myString) {
        return myString.replaceAll("[a-l]", "l");
    }

    public static void main(String[] args) {
        System.out.println(solution1("abcdevwxyz"));
    }
}
