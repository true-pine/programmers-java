package org.example.training.day7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

/**
 * 배열 만들기 2
 */
public class Ex2 {
    public static int[] solution1(int l, int r) {
        List<Integer> answer = new ArrayList<>();

        for(int i = l; i <= r; i++) {
            String str = String.valueOf(i);

            boolean include = true;

            for(char c : str.toCharArray()) {
                if(c != '0' && c != '5') {
                    include = false;
                    break;
                }
            }

            if(include) answer.add(i);
        }

        if(answer.size() == 0) {
            answer.add(-1);
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }

    public static int[] solution2(int l, int r) {   // stream을 이용한 풀이
        int[] answer = IntStream.rangeClosed(l, r)
                .filter(n -> String.valueOf(n).chars().allMatch(c -> c == '0' || c == '5'))
                .toArray();
        return answer.length == 0 ? new int[]{-1} : answer;
    }

    public static int[] solution3(int l, int r) {   // 이진법을 이용한 풀이
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i < 64; i++) {
            int num = Integer.parseInt(Integer.toBinaryString(i)) * 5;
            if (l <= num && num <= r)
                list.add(num);
        }

        return list.isEmpty() ? new int[] { -1 } : list.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution3(100_000, 1_000_000)));
    }
}
