package org.example.training.day11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * 배열 만들기 1
 */
public class Ex2 {
    public static int[] solution1(int n, int k) {   // stream을 이용한 풀이
        return IntStream.iterate(1, i -> i + 1).limit(n).filter(i -> i % k == 0).toArray();
    }

    public static int[] solution2(int n, int k) {   // collection을 이용한 풀이
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 1; i <= n; i++) {
            if(i % k == 0) list.add(i);
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    public static int[] solution3(int n, int k) {   // 속도가 가장 빠른 풀이
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 1; i <= n; i++) {
            if(i % k == 0) list.add(i);
        }

        int[] answer = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution3(10, 3)));
    }
}
