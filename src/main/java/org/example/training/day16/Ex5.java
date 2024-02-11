package org.example.training.day16;

import java.util.stream.Collectors;

/**
 * 특정한 문자를 대문자로 바꾸기
 */
public class Ex5 {
    public static String solution1(String my_string, String alp) {      // for-loop
        StringBuilder sb = new StringBuilder();

        for(char c : my_string.toCharArray()) {
            if(c == alp.charAt(0))
                sb.append(Character.toUpperCase(c));
            else
                sb.append(c);
        }

        return sb.toString();
    }

    public static String solution2(String my_string, String alp) {      // stream
        return my_string.chars()
                .mapToObj(c -> (char) c)
                .map(c -> c == alp.charAt(0) ? String.valueOf(Character.toUpperCase(c)) : String.valueOf(c))
                .collect(Collectors.joining());
    }

    public static void main(String[] args) {
        System.out.println(solution2("programmers", "p"));
    }
}
