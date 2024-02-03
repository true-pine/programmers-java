package org.example.training.day7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * 카운트 업
 */
public class Ex3 {
    public static int[] solution1(int start_num, int end_num) {     // stream을 이용한 풀이
        return IntStream.rangeClosed(start_num, end_num).toArray();
    }

    public static int[] solution2(int start_num, int end_num) {     // collection을 이용한 풀이
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = start_num; i <= end_num; i++) {
            answer.add(i);
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }

    public static int[] solution3(int start_num, int end_num) {     // 배열을 이용한 풀이
        int[] answer = new int[end_num - start_num + 1];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = start_num + i;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution3(3, 10)));
    }
}
