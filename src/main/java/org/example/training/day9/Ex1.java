package org.example.training.day9;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 배열 만들기 5
 */
public class Ex1 {
    public static int[] solution1(String[] intStrs, int k, int s, int l) {
        return Arrays.stream(intStrs)
                .mapToInt(str -> Integer.parseInt(str.substring(s, s + l)))
                .filter(n -> n > k)
                .toArray();
    }

    public static int[] solution2(String[] intStrs, int k, int s, int l) {
        ArrayList<Integer> answer = new ArrayList<>();

        for (String intStr : intStrs) {
            int num = Integer.parseInt(intStr.substring(s, s + l));
            if(num > k) answer.add(num);
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution1(new String[]{"0123456789", "9876543210", "9999999999999" }, 50_000, 5, 5)));
    }
}
