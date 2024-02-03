package org.example.training.day7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

/**
 * 배열 만들기 4
 */
public class Ex5 {
    public static int[] solution1(int[] arr) {
        ArrayList<Integer> stk = new ArrayList<>();

        int i = 0;
        while(i < arr.length) {
            if(stk.isEmpty()) {
                stk.add(arr[i++]);
            } else {
                if(stk.get(stk.size() - 1) < arr[i]) {
                    stk.add(arr[i++]);
                } else {
                    stk.remove(stk.size() - 1);
                }
            }
        }

        return stk.stream().mapToInt(Integer::intValue).toArray();
    }

    public static int[] solution2(int[] arr) {
        Stack<Integer> stack = new Stack<>();

        int i = 0;
        while (i < arr.length) {
            if (stack.isEmpty() || stack.peek() < arr[i]) {
                stack.push(arr[i++]);
            } else if (stack.peek() >= arr[i]) {
                stack.pop();
            }
        }

        return stack.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution1(new int[]{1, 4, 2, 5, 3})));
    }
}
