package org.example.beginner.day10;

/**
 * 공 던지기
 */
public class Ex3 {
    public static int solution1(int[] numbers, int k) {
        int lastNum = 0;

        for(int i = 0, loop = 0; loop < k; loop++) {
            lastNum = numbers[i % numbers.length];
            i += 2;
        }

        return lastNum;
    }

    public static int solution2(int[] numbers, int k) {     // 위 과정을 하나씩 써보면 이와 같이 공식으로 요약할 수 있음
        return numbers[((k - 1) * 2) % numbers.length];
    }

    public static void main(String[] args) {
        System.out.println(solution1(new int[]{1,2,3,4}, 2));
    }
}
