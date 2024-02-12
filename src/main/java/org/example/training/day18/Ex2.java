package org.example.training.day18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/**
 * 문자열 잘라서 정렬하기
 */
public class Ex2 {
    public static String[] solution1(String myString) {
        ArrayList<String> list = new ArrayList<>();

        for (String x : myString.split("x")) {
            if(!x.isEmpty())
                list.add(x);
        }

        list.sort(Comparator.naturalOrder());

        return list.toArray(new String[0]);
    }

    public static String[] solution2(String myString) {     // stream
        return Arrays.stream(myString.split("x"))
                .filter(s -> !s.isEmpty())
                .sorted()
                .toArray(String[]::new);
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution2("axbxcxdx")));
    }
}
