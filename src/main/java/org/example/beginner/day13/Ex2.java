package org.example.beginner.day13;

import java.util.Arrays;

/**
 * 배열 원소의 길이
 */
public class Ex2 {
    public static int[] solution1(String[] strlist) {
        int[] answer = new int[strlist.length];

        for(int i = 0; i < strlist.length; i++)
            answer[i] = strlist[i].length();

        return answer;
    }

    public static int[] solution2(String[] strlist) {   // stream
        return Arrays.stream(strlist).mapToInt(String::length).toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution1(new String[]{"We", "are", "the", "world!"})));
    }
}
