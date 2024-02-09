package org.example.training.day12;

import java.util.stream.IntStream;

/**
 * 첫 번째로 나오는 음수
 */
public class Ex2 {
    public static int solution1(int[] num_list) {
        int answer = -1;
        for(int i = 0; i < num_list.length; i++) {
            if(num_list[i] < 0) {
                answer = i;
                break;
            }
        }
        return answer;
    }

    public static int solution2(int[] num_list) {   // stream을 이용한 풀이
        return IntStream.range(0, num_list.length).filter(idx -> num_list[idx] < 0).findFirst().orElse(-1);
    }

    public static void main(String[] args) {
        System.out.println(solution2(new int[]{12, 4, 15, 46, 38, -2, 15}));
    }
}
