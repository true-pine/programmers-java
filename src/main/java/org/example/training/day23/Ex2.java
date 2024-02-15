package org.example.training.day23;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * 꼬리 문자열
 */
public class Ex2 {
    public static String solution1(String[] str_list, String ex) {  // for-loop
        StringBuilder sb = new StringBuilder();
        for(String str : str_list) {
            if(!str.contains(ex))
                sb.append(str);
        }
        return sb.toString();
    }

    public static String solution2(String[] str_list, String ex) {  // stream
        return Arrays.stream(str_list).filter(s -> !s.contains(ex)).collect(Collectors.joining());
    }

    public static void main(String[] args) {
        System.out.println(solution2(new String[]{"abc", "def", "ghi"}, "ef"));
    }
}
