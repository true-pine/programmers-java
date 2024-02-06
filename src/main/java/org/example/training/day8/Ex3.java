package org.example.training.day8;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * 글자 이어 붙여 문자열 만들기
 */
public class Ex3 {
    public static String solution1(String my_string, int[] index_list) {
        StringBuilder answer = new StringBuilder();
        for(int idx : index_list) {
            answer.append(my_string.charAt(idx));
        }
        return answer.toString();
    }

    public static String solution2(String my_string, int[] index_list) {    // stream을 이용한 풀이
        return Arrays.stream(index_list)
                .mapToObj(value -> String.valueOf(my_string.charAt(value)))
                .collect(Collectors.joining());
    }

    public static void main(String[] args) {
        System.out.println(solution1("cvsgiorszzzmrpaqpe", new int[]{16, 6, 5, 3, 12, 14, 11, 11, 17, 12, 7}));
    }
}
