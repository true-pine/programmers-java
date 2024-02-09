package org.example.training.day12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 2의 영역
 */
public class Ex4 {
    public static int[] solution1(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int num : arr) {
            list.add(num);
        }

        ArrayList<Integer> answer = new ArrayList<>();
        if(list.indexOf(2) != -1) {
            for(int i = list.indexOf(2); i <= list.lastIndexOf(2); i++) {
                answer.add(arr[i]);
            }
        }

        return answer.size() > 0 ? answer.stream().mapToInt(Integer::intValue).toArray() : new int[]{-1};
    }

    public static int[] solution2(int[] arr) {      // stream을 이용한 풀이
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        return list.contains(2) ? list.subList(list.indexOf(2), list.lastIndexOf(2) + 1).stream().mapToInt(Integer::intValue).toArray() : new int[]{-1};
    }

    public static void main(String[] args) {

    }
}
