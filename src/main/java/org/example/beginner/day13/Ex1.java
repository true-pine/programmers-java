package org.example.beginner.day13;

import java.util.Stack;

/**
 * 컨트롤 제트
 */
public class Ex1 {
    public static int solution1(String s) {
        Stack<Integer> stack = new Stack<>();

        for(String str : s.split(" ")) {
            if(str.equals("Z"))
                stack.pop();
            else
                stack.push(Integer.parseInt(str));
        }

        return stack.stream().mapToInt(Integer::intValue).sum();
    }

    public static void main(String[] args) {
        System.out.println(solution1("10 Z 20 Z 1"));
    }
}
