package org.example.training.day24;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 그림 확대
 */
public class Ex2 {
    public static String[] solution1(String[] picture, int k) {
        ArrayList<String> list = new ArrayList<>();

        for(String s : picture) {
            StringBuilder sb = new StringBuilder();
            // 가로 확장
            for(char c : s.toCharArray()) {
                for(int i = 0; i < k; i++)
                    sb.append(c);
            }
            // 세로 확장
            for(int i = 0; i < k; i++)
                list.add(sb.toString());
        }

        return list.toArray(new String[0]);
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution1(new String[]{
                ".xx...xx.", "x..x.x..x", "x...x...x", ".x.....x.", "..x...x..", "...x.x...", "....x...."
        }, 2)));
    }
}
