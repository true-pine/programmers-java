package org.example.training.day9;

import java.util.ArrayList;

/**
 * 접미사인지 확인하기
 */
public class Ex5 {
    public static int solution1(String my_string, String is_suffix) {
        ArrayList<String> list = new ArrayList<>();

        for(int i = 0; i < my_string.length(); i++) {
            list.add(my_string.substring(i));
        }

        return list.contains(is_suffix) ? 1 : 0;
    }

    public static int solution2(String my_string, String is_suffix) {
        return my_string.endsWith(is_suffix) ? 1 : 0;
    }

    public static void main(String[] args) {
        System.out.println(solution2("banana", "ana"));
    }
}
