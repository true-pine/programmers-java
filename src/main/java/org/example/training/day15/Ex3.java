package org.example.training.day15;

/**
 * 1로 만들기
 */
public class Ex3 {
    public static int solution1(int[] num_list) {
        int answer = 0;

        for(int num : num_list) {
            while(num != 1) {
                if(num % 2 == 0) {
                    num = num / 2;
                    answer++;
                } else {
                    num = (num - 1) / 2;
                    answer++;
                }
            }
        }

        return answer;
    }

    public static int solution2(int[] num_list) {
        int answer = 0;

        for (int num : num_list) {
            while(num != 1) {
                num = num / 2;  // 정수형이라 굳이 1을 빼지 않아도 된다.
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution2(new int[]{12, 4, 15, 1, 14}));
    }
}
