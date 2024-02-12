package org.example.training.day18;

import java.util.stream.Collectors;

/**
 * 문자열 바꿔서 찾기
 */
public class Ex4 {
    public static int solution1(String myString, String pat) {
        StringBuilder sb = new StringBuilder(myString);

        for(int i = 0; i < sb.length(); i++) {
            sb.setCharAt(i, sb.charAt(i) == 'A' ? 'B' : 'A');
        }

        return sb.toString().contains(pat) ? 1 : 0;
    }

    public static int solution2(String myString, String pat) {      // stream
        return myString.chars()
                .mapToObj(c -> (char) c)
                .map(c -> c == 'A' ? 'B' : 'A')
                .map(String::valueOf)
                .collect(Collectors.joining()).contains(pat) ? 1 : 0;
    }

    public static int solution3(String myString, String pat) {      // replace 메서드 활용
        return myString.replace('A', 'a')
                .replace('B', 'A')
                .replace('a', 'A')
                .contains(pat) ? 1 : 0;
    }

    public static void main(String[] args) {
        System.out.println(solution3("ABBAA", "AABB"));
    }
}
