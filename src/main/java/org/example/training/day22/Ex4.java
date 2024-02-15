package org.example.training.day22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * 배열의 원소 삭제하기
 */
public class Ex4 {
    public static int[] solution1(int[] arr, int[] delete_list) {
        ArrayList<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toCollection(ArrayList::new));
        for(Integer delete : delete_list) {
            list.remove(delete);
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    public static int[] solution2(int[] arr, int[] delete_list) {
        return Arrays.stream(arr).filter(o1 -> Arrays.stream(delete_list).noneMatch(o2 -> o1 == o2)).toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution1(new int[]{293, 1000, 395, 678, 94}, new int[]{94, 777, 104, 1000, 1, 12})));
    }
}
