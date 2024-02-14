package org.example.training.day21;

import java.util.Arrays;

/**
 * 문자열 정수의 합
 */
public class Ex4 {
    public static int solution1(String num_str) {   // for-loop
        int answer = 0;
        for (char c : num_str.toCharArray()) {
            answer += Integer.parseInt(String.valueOf(c));
        }
        return answer;
    }

    public static int solution2(String num_str) {   // stream
        return Arrays.stream(num_str.split("")).mapToInt(Integer::parseInt).sum();
    }

    public static void main(String[] args) {
        System.out.println(solution2("123456789"));
    }
}
