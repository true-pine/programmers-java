package org.example.training.day3;

/**
 * 문자열 곱하기
 */
public class Ex3 {
    public static String solution1(String my_string, int k) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < k; i++) {
            sb.append(my_string);
        }
        return sb.toString();
    }

    public static String solution2(String my_string, int k) {   // 한줄 코딩 방법
        return my_string.repeat(k);
    }

    public static void main(String[] args) {
        System.out.println(solution2("string", 3));
    }
}
