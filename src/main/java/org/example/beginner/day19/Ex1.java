package org.example.beginner.day19;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * 7의 개수
 */
public class Ex1 {
    public static int solution1(int[] array) {
        String str = Arrays.stream(array).mapToObj(String::valueOf).collect(Collectors.joining());

        int answer = 0;

        for(char c : str.toCharArray())
            if(c == '7')
                answer++;

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution1(new int[]{7, 77, 17}));
    }
}
