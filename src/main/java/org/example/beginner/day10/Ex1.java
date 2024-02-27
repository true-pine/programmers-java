package org.example.beginner.day10;

/**
 * 점의 위치 구하기
 */
public class Ex1 {
    public static int solution1(int[] dot) {
        int answer = -1;

        if(dot[0] > 0 && dot[1] > 0) answer = 1;
        else if(dot[0] < 0 && dot[1] > 0) answer = 2;
        else if(dot[0] < 0 && dot[1] < 0) answer = 3;
        else if(dot[0] > 0 && dot[1] < 0) answer = 4;

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution1(new int[]{2,4}));
    }
}
