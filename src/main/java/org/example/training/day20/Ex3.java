package org.example.training.day20;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/**
 * 문자열 묶기
 */
public class Ex3 {
    public static int solution1(String[] strArr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (String s : strArr) {
            map.put(s.length(), map.containsKey(s.length()) ? map.get(s.length()) + 1 : 1);
        }
        return map.entrySet().stream().max(Comparator.comparingInt(Map.Entry::getValue)).get().getValue();
    }

    public static int solution2(String[] strArr) {      // 배열만 사용한 풀이
        int[] lengthArr = new int[31];
        for (String s : strArr) {
            lengthArr[s.length()]++;
        }

        int answer = 0;
        for (int i : lengthArr) {
            answer = Math.max(answer, i);
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution1(new String[]{"a","bc","d","efg","hi"}));
    }
}
