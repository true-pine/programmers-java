package org.example.training.day15;

/**
 * 길이에 따른 연산
 */
public class Ex4 {
    public static int solution1(int[] num_list) {
        int answer = 0;

        if(num_list.length >= 11) {
            for(int num : num_list) {
                answer += num;
            }
        } else {
            answer = 1;
            for(int num : num_list) {
                answer *= num;
            }
        }

        return answer;
    }

    public static int solution2(int[] num_list) {
        int answer = num_list.length >= 11 ? 0 : 1;

        for (int num : num_list) {
            if(num_list.length >= 11)
                answer += num;
            else
                answer *= num;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution2(new int[]{2, 3, 4, 5}));
    }
}
