package org.example.beginner.day16;

/**
 * 편지
 */
public class Ex1 {
    public static int solution1(String message) {
        return message.length() * 2;
    }

    public static void main(String[] args) {
        System.out.println(solution1("happy birthday!"));
    }
}
