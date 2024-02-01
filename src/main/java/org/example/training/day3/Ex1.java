package org.example.training.day3;

import java.util.Scanner;

/**
 * 문자열 섞기
 */
public class Ex1 {
    public static String solution(String str1, String str2) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str1.length(); i++) {
            sb.append(str1.charAt(i)).append(str2.charAt(i));
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        System.out.println(solution(a, b));
    }
}
