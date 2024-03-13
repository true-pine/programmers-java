package org.example.beginner.day19;

import java.util.Arrays;

/**
 * 잘라서 배열로 저장하기
 */
public class Ex2 {
    public static String[] solution1(String my_str, int n) {
        int length = my_str.length() / n + (my_str.length() % n == 0 ? 0 : 1);
        String[] answer = new String[length];

        for(int i = 0; i < length; i++) {
            if((i + 1) * n > my_str.length())
                answer[i] = my_str.substring(i * n);
            else
                answer[i] = my_str.substring(i * n, (i + 1) * n);
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution1("abc1Addfggg4556b", 6)));
    }
}
