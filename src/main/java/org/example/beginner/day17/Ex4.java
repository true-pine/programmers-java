package org.example.beginner.day17;

import java.util.Arrays;

/**
 * OX퀴즈
 */
public class Ex4 {
    public static String[] solution1(String[] quiz) {
        String[] answer = new String[quiz.length];

        for(int i = 0; i < quiz.length; i++) {
            String[] arr = quiz[i].split(" ");
            if(arr[1].equals("+")) {
                answer[i] = Integer.parseInt(arr[0]) + Integer.parseInt(arr[2]) == Integer.parseInt(arr[4]) ? "O" : "X";
            } else {
                answer[i] = Integer.parseInt(arr[0]) - Integer.parseInt(arr[2]) == Integer.parseInt(arr[4]) ? "O" : "X";
            }
        }

        return answer;
    }

    public static String[] solution2(String[] quiz) {
        String[] answer = new String[quiz.length];

        for(int i = 0; i < quiz.length; i++) {
            String[] arr = quiz[i].split(" ");
            answer[i] = Integer.parseInt(arr[0]) + (arr[1].equals("+") ? 1 : -1) * Integer.parseInt(arr[2]) == Integer.parseInt(arr[4]) ? "O" : "X";
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution1(new String[]{"3 - 4 = -3", "5 + 6 = 11"})));
    }
}
