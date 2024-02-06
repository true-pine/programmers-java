package org.example.training.day9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * 접미사 배열
 */
public class Ex4 {
    public static String[] solution1(String my_string) {
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < my_string.length(); i++) {
            list.add(my_string.substring(i));
        }

        Collections.sort(list);

        return list.toArray(new String[0]);
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution1("programmers")));
    }
}
