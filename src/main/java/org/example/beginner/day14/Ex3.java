package org.example.beginner.day14;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * 암호 해독
 */
public class Ex3 {
    public static String solution1(String cipher, int code) {
        StringBuilder sb = new StringBuilder();

        for(int i = code; i <= cipher.length(); i += code) {
            sb.append(cipher.charAt(i - 1));
        }

        return sb.toString();
    }

    public static String solution2(String cipher, int code) {   // stream
        return IntStream.iterate(code, i -> i + code).limit(cipher.length() / code)
                .mapToObj(i -> String.valueOf(cipher.charAt(i - 1)))
                .collect(Collectors.joining());
    }

    public static void main(String[] args) {
        System.out.println(solution1("dfjardstddetckdaccccdegk", 4));
    }
}
