package org.example.beginner.day15;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * 한 번만 등장한 문자
 */
public class Ex3 {
    public static String solution1(String s) {
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < s.length(); i++) {
            if(count(s, s.charAt(i)) == 1)
                sb.append(s.charAt(i));
        }

        return Arrays.stream(sb.toString().split("")).sorted().collect(Collectors.joining());
    }

    private static int count(String str, char ch) {
        int count = 0;
        for(char c : str.toCharArray()) {
            if(c == ch)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(solution1("abcabcadc"));
    }
}
