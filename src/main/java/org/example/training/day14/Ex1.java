package org.example.training.day14;

/**
 * 홀수 vs 짝수
 */
public class Ex1 {
    public static int solution1(int[] num_list) {
        int even = 0, odd = 0;

        for(int i = 0; i < num_list.length; i++) {
            if(i % 2 == 0) {
                odd += num_list[i];
            } else {
                even += num_list[i];
            }
        }

        return Math.max(even, odd);
    }

    public static void main(String[] args) {
        System.out.println(solution1(new int[]{4, 2, 6, 1, 7, 6}));
    }
}
