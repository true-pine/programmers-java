package org.example.beginner.day17;

/**
 * 숫자 찾기
 */
public class Ex1 {
    public static int solution1(int num, int k) {
        String[] str = String.valueOf(num).split("");

        int answer = -1;

        for(int i = 0; i < str.length; i++) {
            if(str[i].equals(String.valueOf(k))) {
                answer = i + 1;
                break;
            }
        }

        return answer;
    }

    public static int solution2(int num, int k) {
        int answer = String.valueOf(num).indexOf(String.valueOf(k));
        return answer < 0 ? answer : answer + 1;
    }

    public static void main(String[] args) {
        System.out.println(solution1(29183, 1));
    }
}
