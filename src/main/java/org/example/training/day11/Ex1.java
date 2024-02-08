package org.example.training.day11;

import java.util.Arrays;

/**
 * 문자 개수 세기
 */
public class Ex1 {
    public static int[] solution1(String my_string) {
        StringBuilder sb = new StringBuilder();

        for(char c = 'A'; c <= 'Z'; c++) {
            sb.append(c);
        }
        for (char c = 'a'; c <= 'z'; c++) {
            sb.append(c);
        }

        int[] answer = new int[52];
        Arrays.fill(answer, 0);
        String str = sb.toString();

        str.chars().map(i -> i - 65).forEach(c -> System.out.print(", " + c));

        for (char c : my_string.toCharArray()) {
            answer[str.indexOf(c)]++;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution1("Programmers")));
    }
}
