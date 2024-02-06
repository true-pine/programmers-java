package org.example.training.day8;

/**
 * 간단한 논리 연산
 */
public class Ex1 {
    public static boolean solution1(boolean x1, boolean x2, boolean x3, boolean x4) {
        return (x1 || x2) && (x3 || x4);
    }

    public static void main(String[] args) {
        System.out.println(solution1(false, true, true, true));
    }
}
