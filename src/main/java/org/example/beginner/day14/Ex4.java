package org.example.beginner.day14;

import java.util.stream.Collectors;

/**
 * 대문자와 소문자
 */
public class Ex4 {
    public static String solution1(String my_string) {
        StringBuilder sb = new StringBuilder(my_string);

        for(int i = 0; i < my_string.length(); i++) {
            if(Character.isLowerCase(my_string.charAt(i)))
                sb.setCharAt(i, Character.toUpperCase(my_string.charAt(i)));
            else
                sb.setCharAt(i, Character.toLowerCase(my_string.charAt(i)));
        }

        return sb.toString();
    }

    public static String solution2(String my_string) {      // stream
        return my_string.chars()
                .mapToObj(c -> String.valueOf((char) (Character.isLowerCase(c) ? Character.toUpperCase(c) : Character.toLowerCase(c))))
                .collect(Collectors.joining());
    }

    public static void main(String[] args) {
        System.out.println(solution1("cccCCC"));
    }
}
