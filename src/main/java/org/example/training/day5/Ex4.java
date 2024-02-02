package org.example.training.day5;

/**
 * 원소들의 곱과 합
 */
public class Ex4 {
    public static int solution(int[] num_list) {
        int mul = 1;
        int sum = 0;

        for(int num : num_list) {
            mul *= num;
            sum += num;
        }

        return mul < sum * sum ? 1 : 0;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{5,7,8,3}));
    }
}
