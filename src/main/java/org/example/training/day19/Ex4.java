package org.example.training.day19;

import java.util.Arrays;
import java.util.Stack;

/**
 * 배열 만들기 6
 */
public class Ex4 {
    public static int[] solution1(int[] arr) {
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < arr.length; i++) {
            if(stack.size() == 0) {
                stack.push(arr[i]);
            } else {
                if(stack.peek() == arr[i]) {
                    stack.pop();
                } else {
                    stack.push(arr[i]);
                }
            }
        }

        return stack.size() > 0 ? stack.stream().mapToInt(Integer::intValue).toArray() : new int[]{-1};
    }

    public static int[] solution2(int[] arr) {      // 조건 수정
        Stack<Integer> stack = new Stack<>();

        for (int i : arr) {
            if(stack.isEmpty() || stack.peek() != i) {
                stack.push(i);
            } else {
                stack.pop();
            }
        }

        return stack.size() > 0 ? stack.stream().mapToInt(Integer::intValue).toArray() : new int[]{-1};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution1(new int[]{0, 1, 1, 1, 0})));
    }
}
