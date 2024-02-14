package org.example.training.day21;

/**
 * 문자열을 정수로 변환하기
 */
public class Ex5 {
    public static int solution1(String n_str) {
        return Integer.parseInt(n_str);
    }

    public static void main(String[] args) {
        System.out.println(solution1("8542"));
    }
}
