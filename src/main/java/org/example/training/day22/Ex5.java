package org.example.training.day22;

/**
 * 부분 문자열인지 확인하기
 */
public class Ex5 {
    public static int solution1(String my_string, String target) {
        return my_string.contains(target) ? 1 : 0;
    }

    public static void main(String[] args) {
        System.out.println(solution1("banana", "ana"));
    }
}
