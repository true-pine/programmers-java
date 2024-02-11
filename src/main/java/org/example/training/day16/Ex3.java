package org.example.training.day16;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * 배열에서 문자열 대소문자 변환하기
 */
public class Ex3 {
    public static String[] solution1(String[] strArr) {     // for-loop
        for(int i = 0; i < strArr.length; i++) {
            strArr[i] = i % 2 == 0 ? strArr[i].toLowerCase() : strArr[i].toUpperCase();
        }
        return strArr;
    }

    public static String[] solution2(String[] strArr) {     // stream
        return IntStream.range(0, strArr.length)
                .mapToObj(i -> i % 2 == 0 ? strArr[i].toLowerCase() : strArr[i].toUpperCase())
                .toArray(String[]::new);
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution2(new String[]{"AAA", "BBB", "CCC", "DDD"})));
    }
}
