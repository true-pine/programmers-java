package org.example.beginner.day6;

import java.util.Scanner;

/**
 * 직각삼각형 출력하기
 */
public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            System.out.println("*".repeat(i));
        }
    }
}
