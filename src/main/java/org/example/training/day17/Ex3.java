package org.example.training.day17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * ad 제거하기
 */
public class Ex3 {
    public static String[] solution1(String[] strArr) {     // stream
        return Arrays.stream(strArr).filter(s -> !s.contains("ad")).toArray(String[]::new);
    }

    public static String[] solution2(String[] strArr) {     // collection 1
        List<String> list = new LinkedList<>(List.of(strArr));
        list.removeIf(s -> s.contains("ad"));
        return list.toArray(new String[0]);
    }

    public static String[] solution3(String[] strArr) {     // collection 2
        ArrayList<String> list = new ArrayList<>();

        for (String s : strArr) {
            if(!s.contains("ad"))
                list.add(s);
        }

        return list.toArray(new String[0]);
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution3(new String[]{"and", "notad", "abcd"})));
    }
}
