package org.example.training.day7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * 콜라츠 수열 만들기
 */
public class Ex4 {
    public static int[] solution1(int n) {  // collection을 이용한 풀이
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(n);

        while(n != 1) {
            if(n % 2 == 0) {
                n = n / 2;
            } else {
                n = 3 * n + 1;
            }
            answer.add(n);
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }

    public static int[] solution2(int n) {  // stream을 이용한 풀이
        return IntStream.concat(
                        IntStream.iterate(n, i -> i > 1, i -> i % 2 == 0 ? i / 2 : i * 3 + 1),
                        IntStream.of(1))
                .toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution2(10)));
    }
}
