package org.example.training.day5;

import java.util.Arrays;

/**
 * 이어 붙인 수
 */
public class Ex5 {
    public static int solution1(int[] num_list) {
        StringBuilder odd = new StringBuilder();
        StringBuilder even = new StringBuilder();

        for(int num : num_list) {
            if(num % 2 == 0) {
                even.append(num);
            } else {
                odd.append(num);
            }
        }

        return Integer.parseInt(odd.toString()) + Integer.parseInt(even.toString());
    }

    public static int solution2(int[] num_list) {   // stream을 활용한 풀이
        StringBuilder odd = new StringBuilder();
        StringBuilder even = new StringBuilder();

        Arrays.stream(num_list).filter(n -> n % 2 == 0).forEach(odd::append);
        Arrays.stream(num_list).filter(n -> n % 2 != 0).forEach(even::append);

        return Integer.parseInt(odd.toString()) + Integer.parseInt(even.toString());
    }

    public static void main(String[] args) {
        System.out.println(solution2(new int[]{3,4,5,2,1}));
    }
}
