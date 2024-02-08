package org.example.training.day10;

import java.util.ArrayList;
import java.util.stream.Collectors;

/**
 * 세로 읽기
 */
public class Ex4 {
    public static String solution1(String my_string, int m, int c) {
        ArrayList<String> list = new ArrayList<>();

        int i = 0;
        while(i + m <= my_string.length()) {
            list.add(my_string.substring(i, i + m));
            i += m;
        }

        return list.stream().map(s -> String.valueOf(s.charAt(c - 1))).collect(Collectors.joining());
    }

    public static String solution2(String my_string, int m, int c) {    // 속도가 훨씬 빠른 풀이
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < my_string.length(); i += m) {
            sb.append(my_string.substring(i, i + m).charAt(c - 1));
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(solution1("ihrhbakrfpndopljhygc", 4, 2));
    }
}
