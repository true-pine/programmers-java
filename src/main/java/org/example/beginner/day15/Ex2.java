package org.example.beginner.day15;

/**
 * 인덱스 바꾸기
 */
public class Ex2 {
    public static String solution1(String my_string, int num1, int num2) {
        StringBuilder sb = new StringBuilder(my_string);
        char temp = sb.charAt(num1);
        sb.setCharAt(num1, sb.charAt(num2));
        sb.setCharAt(num2, temp);
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(solution1("hello", 1, 2));
    }
}
