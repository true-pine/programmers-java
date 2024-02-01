package org.example.training.day3;

/**
 * 더 크게 합치기
 */
public class Ex4 {
    public static int solution1(int a, int b) {
        String str1 = String.valueOf(a) + String.valueOf(b);
        String str2 = String.valueOf(b) + String.valueOf(a);
        a = Integer.parseInt(str1);
        b = Integer.parseInt(str2);
        return a >= b ? a : b;
    }

    public static int solution2(int a, int b) {
        String str1 = String.valueOf(a) + String.valueOf(b);
        String str2 = String.valueOf(b) + String.valueOf(a);
        a = Integer.parseInt(str1);
        b = Integer.parseInt(str2);
        return Math.max(a, b);
    }

    public static int solution3(int a, int b) {     // 한줄 코딩 방법
        return Math.max(Integer.parseInt(a + "" + b), Integer.parseInt(a + "" + b));
    }

    public static void main(String[] args) {
        System.out.println(solution3(9, 91));
    }
}
