package org.example.training.day6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 수열과 구간 쿼리 2
 */
public class Ex5 {
    public static int[] solution1(int[] arr, int[][] queries) {
        List<Integer> answer = new ArrayList<>();

        for (int[] query : queries) {
            int[] temp = Arrays.copyOfRange(arr, query[0], query[1] + 1);
            int selectedNum = Arrays.stream(temp).filter(n -> n > query[2]).min().orElse(-1);
            answer.add(selectedNum);
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }

    public static int[] solution2(int[] arr, int[][] queries) {     // stream을 사용하지 않은 풀이
        int[] answer = new int[queries.length];

        int idx = 0;
        for (int[] query : queries) {
            int selectedNum = -1;
            for (int i = query[0]; i <= query[1]; i++) {
                if(arr[i] > query[2]) {
                    if(selectedNum == -1) {
                        selectedNum = arr[i];
                    } else {
                        selectedNum = Math.min(selectedNum, arr[i]);
                    }
                }
            }
            answer[idx++] = selectedNum;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution1(new int[]{0, 1, 2, 4, 3}, new int[][]{{0, 4, 2},{0, 3, 2},{0, 2, 2}})));
    }
}
