package org.example.beginner.day6;

/**
 * 문자 반복 출력하기
 */
public class Ex4 {
    public static String solution1(String my_string, int n) {
        StringBuilder sb = new StringBuilder();

        for(char c : my_string.toCharArray()) {
            sb.append(String.valueOf(c).repeat(n));
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(solution1("hello", 3));
    }
}
