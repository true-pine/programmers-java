package org.example.training.day2;

import java.util.Scanner;

/**
 * 문자열 돌리기
 */
public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        for (char c : a.toCharArray()) {
            System.out.println(c);
        }
    }
}
