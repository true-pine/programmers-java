package org.example.beginner.day9;

/**
 * 개미 군단
 */
public class Ex1 {
    public static int solution1(int hp) {
        int[] unit = {5, 3, 1};

        int answer = 0;

        int i = 0;
        while(true) {
            if(hp / unit[i] == 0)
                i++;

            answer += hp / unit[i];

            if(hp % unit[i] == 0)
                break;

            hp = hp % unit[i];
        }

        return answer;
    }

    public static int solution2(int hp) {
        return hp / 5 + (hp % 5 / 3) + hp % 5 % 3;
    }

    public static void main(String[] args) {
        System.out.println(solution2(999));
    }
}
