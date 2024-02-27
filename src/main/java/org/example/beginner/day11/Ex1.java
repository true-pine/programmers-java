package org.example.beginner.day11;

/**
 * 주사위의 개수
 */
public class Ex1 {
    public static int solution1(int[] box, int n) {
        return (box[0] / n) * (box[1] / n) * (box[2] / n);
    }

    public static void main(String[] args) {
        System.out.println(solution1(new int[]{10,8,6}, 3));
    }
}
