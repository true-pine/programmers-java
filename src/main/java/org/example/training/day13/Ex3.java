package org.example.training.day13;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 왼쪽 오른쪽
 */
public class Ex3 {
    public static String[] solution1(String[] str_list) {
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < str_list.length; i++) {
            if (str_list[i].equals("l")) {
                for(int j = 0; j < i; j++) {
                    list.add(str_list[j]);
                }
                break;
            } else if (str_list[i].equals("r")) {
                for (int j = i + 1; j < str_list.length; j++) {
                    list.add(str_list[j]);
                }
                break;
            }
        }

        return list.size() > 0 ? list.toArray(new String[0]) : new String[0];
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution1(new String[]{"u"})));
    }
}
