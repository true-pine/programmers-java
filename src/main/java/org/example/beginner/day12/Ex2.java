package org.example.beginner.day12;

import java.util.Arrays;

/**
 * 문자열 정렬하기 (1)
 */
public class Ex2 {
    public static int[] solution1(String my_string) {
        my_string = my_string.replaceAll("[^0-9]", "");

        int[] answer = new int[my_string.length()];

        for(int i = 0; i < my_string.length(); i++)
            answer[i] = Integer.parseInt(String.valueOf(my_string.charAt(i)));

        Arrays.sort(answer);

        return answer;
    }

    public static int[] solution2(String my_string) {   // stream
        return Arrays.stream(my_string.replaceAll("[^0-9]", "").split(""))
                .mapToInt(Integer::parseInt)
                .sorted().toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution1("abcde0")));
    }
}
