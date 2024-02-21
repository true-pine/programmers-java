package org.example.beginner.day3;

import java.util.HashMap;
import java.util.Map;

/**
 * 최빈값 구하기
 */
public class Ex3 {
    public static int solution1(int[] array) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i : array) {
            map.put(i, map.containsKey(i) ? map.get(i) + 1 : 1);
        }

        Map.Entry<Integer, Integer> maxEntry = map.entrySet().stream().max((o1, o2) -> o1.getValue() - o2.getValue()).get();

        return map.entrySet().stream().filter(entry -> entry.getValue() == maxEntry.getValue()).count() > 1 ? -1 : maxEntry.getKey();
    }

    public static void main(String[] args) {
        System.out.println(solution1(new int[]{1,2,3,3,3,4}));
    }
}
