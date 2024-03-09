package org.example.beginner.day14;

/**
 * 369게임
 */
public class Ex2 {
    public static int solution1(int order) {
        return String.valueOf(order).replaceAll("[^369]", "").length();
    }

    public static void main(String[] args) {
        System.out.println(solution1(29423));
    }
}
