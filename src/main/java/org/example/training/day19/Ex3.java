package org.example.training.day19;

import java.util.Arrays;
import java.util.Stack;

/**
 * 빈 배열에 추가, 삭제하기
 */
public class Ex3 {
    public static int[] solution1(int[] arr, boolean[] flag) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < flag.length; i++) {
            if(flag[i]) {
                for(int j = 0; j < arr[i] * 2; j++)
                    stack.push(arr[i]);
            } else {
                for(int j = 0; j < arr[i]; j++)
                    stack.pop();
            }
        }

        return stack.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution1(new int[]{3, 2, 4, 1, 3}, new boolean[]{true, false, true, false, false})));
    }
}
