package org.example.training.day15;

/**
 * 원하는 문자열 찾기
 */
public class Ex5 {
    public static int solution1(String myString, String pat) {
        myString = myString.toLowerCase();
        pat = pat.toLowerCase();

        return myString.contains(pat) ? 1 : 0;
    }

    public static void main(String[] args) {

    }
}
