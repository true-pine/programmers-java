package org.example.training.day12;

import java.util.Arrays;

/**
 * 리스트 자르기
 */
public class Ex1 {
    public static int[] solution1(int n, int[] slicer, int[] num_list) {
        int a = slicer[0], b = slicer[1], c = slicer[2];

        int[] answer = {};
        int idx = 0;

        switch(n) {
            case 1:
                answer = new int[b + 1];
                System.arraycopy(num_list, 0, answer, 0, b + 1);
                return answer;
            case 2:
                answer = new int[num_list.length - a];
                for(int i = a; i < num_list.length; i++) {
                    answer[idx++] = num_list[i];
                }
                return answer;
            case 3:
                answer = new int[b - a + 1];
                for(int i = a; i <= b; i++) {
                    answer[idx++] = num_list[i];
                }
                return answer;
            case 4:
                answer = new int[((b - a + 1) / c) + ((b - a + 1) % c)];
                for(int i = a; i <= b; i += c) {
                    answer[idx++] = num_list[i];
                }
                return answer;
            default:
                return new int[0];
        }
    }

    public static int[] solution2(int n, int[] slicer, int[] num_list) {   // 다른 사람의 풀이를 참고한 풀이
        int start = n == 1 ? 0 : slicer[0];
        int end = n == 2 ? num_list.length - 1 : slicer[1];
        int step = n == 4 ? slicer[2] : 1;

        int[] answer = new int[(end - start + step) / step];
        for (int i = start, idx = 0; i <= end; i += step) {
            answer[idx++] = num_list[i];
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution2(3, new int[]{1, 5, 2}, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9})));
    }
}
