package org.example.training.day2;

import java.util.Scanner;

/**
 * 문자열 겹쳐쓰기
 */
public class Ex5 {
    public static String solution(String a, String b, int length) {
        String prefix = a.substring(0, length);
        String suffix = a.substring(length + b.length());

        return prefix + b + suffix;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        int length = sc.nextInt();

        System.out.println(solution(a, b, length));
    }
}
