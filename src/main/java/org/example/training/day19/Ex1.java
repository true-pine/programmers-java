package org.example.training.day19;

import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * 세 개의 구분자
 */
public class Ex1 {
    public static String[] solution1(String myStr) {    // StringTokenizer
        StringTokenizer st = new StringTokenizer(myStr, "abc");

        String[] answer = new String[st.countTokens()];

        int idx = 0;
        while(st.hasMoreTokens()) {
            answer[idx++] = st.nextToken();
        }

        return answer.length == 0 ? new String[]{"EMPTY"} : answer;
    }

    public static String[] solution2(String myStr) {    // stream
        String[] answer = Arrays.stream(myStr.split("[abc]"))
                .filter(s -> !s.isEmpty())
                .toArray(String[]::new);
        return answer.length > 0 ? answer : new String[]{"EMPTY"};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution2("baconlettucetomato")));
        System.out.println(Arrays.toString(solution2("cabab")));
        System.out.println(Arrays.toString(solution2("abcd")));
    }
}
