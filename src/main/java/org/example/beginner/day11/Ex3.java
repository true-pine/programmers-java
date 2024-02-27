package org.example.beginner.day11;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 최댓값 만들기 (1)
 */
public class Ex3 {
    public static int solution1(int[] numbers) {
        Arrays.sort(numbers);

        int lastIndex = numbers.length - 1;
        return numbers[lastIndex--] * numbers[lastIndex];
    }

    public static int solution2(int[] numbers) {    // stream
        return Arrays.stream(numbers)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .limit(2)
                .reduce(1, (integer, integer2) -> integer * integer2);
    }

    public static void main(String[] args) {
        System.out.println(solution2(new int[]{1,2,3,4,5}));
    }
}
