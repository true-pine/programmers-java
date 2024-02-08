package org.example.training.day10;

/**
 * 접두사인지 확인하기
 */
public class Ex2 {
    public static int solution1(String my_string, String is_prefix) {
        return my_string.startsWith(is_prefix) ? 1 : 0;
    }

    public static void main(String[] args) {
        System.out.println(solution1("banana", "ban"));
    }
}
