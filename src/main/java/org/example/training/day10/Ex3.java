package org.example.training.day10;

/**
 * 문자열 뒤집기
 */
public class Ex3 {
    public static String solution1(String my_string, int s, int e) {
        return my_string.substring(0, s) +
                new StringBuilder(my_string.substring(s, e + 1)).reverse().toString() +
                my_string.substring(e + 1);
    }

    public static String solution2(String my_string, int s, int e) {    // 속도가 훨씬 빠른 풀이
        char[] chars = my_string.toCharArray();
        while(s < e) {
            char temp = chars[s];
            chars[s++] = chars[e];
            chars[e--] = temp;
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        System.out.println(solution2("Progra21Sremm3", 6, 12));
    }
}
