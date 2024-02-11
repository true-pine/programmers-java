package org.example.training.day17;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 공백으로 구분하기 2
 */
public class Ex5 {
    public static String[] solution1(String my_string) {
        ArrayList<String> list = new ArrayList<>();

        for(String s : my_string.split(" ")) {
            if(!s.isEmpty())
                list.add(s);
        }

        return list.toArray(new String[0]);
    }

    public static String[] solution2(String my_string) {
        return my_string.trim().split("\\s+");
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution1("i    love  you")));
    }
}
