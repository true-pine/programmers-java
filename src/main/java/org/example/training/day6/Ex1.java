package org.example.training.day6;

import java.util.Arrays;

/**
 * 마지막 두 원소
 */
public class Ex1 {
    public static int[] solution1(int[] num_list) {     // 웹 IDE를 이용한 풀이
        int last = num_list[num_list.length - 1];
        int beforeLast = num_list[num_list.length - 2];
        int add = last > beforeLast ? last - beforeLast : last * 2;

        int[] newArr = new int[num_list.length + 1];
        for(int i = 0; i < num_list.length; i++) {
            newArr[i] = num_list[i];
        }
        newArr[num_list.length] = add;
        return newArr;
    }

    public static int[] solution2(int[] num_list) {     // Arrays 클래스를 이용한 풀이
        int[] newArr = Arrays.copyOf(num_list, num_list.length + 1);

        int last = num_list[num_list.length - 1];
        int beforeLast = num_list[num_list.length - 2];

        newArr[num_list.length] = last > beforeLast ? last - beforeLast : last * 2;

        return newArr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution2(new int[]{2, 1, 6})));
    }
}
