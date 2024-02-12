package org.example.training.day18;

import java.util.Arrays;

/**
 * x 사이의 개수
 */
public class Ex1 {
    public static int[] solution1(String myString) {
        int[] answer = new int[myString.endsWith("x") ? myString.split("x").length + 1 : myString.split("x").length];

        int idx = 0;
        for(String s : myString.split("x")) {
            answer[idx++] = s.length();
        }

        if(myString.endsWith("x"))
            answer[idx] = 0;

        return answer;
    }

    public static int[] solution2(String myString) {    // stream
        return Arrays.stream(myString.split("x", myString.length()))
                .mapToInt(String::length)
                .toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution2("oxooxoxxox")));
    }
}
