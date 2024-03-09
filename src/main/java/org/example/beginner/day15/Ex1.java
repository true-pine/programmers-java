package org.example.beginner.day15;

import java.util.HashMap;

/**
 * 영어가 싫어요
 */
public class Ex1 {
    public static long solution1(String numbers) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("zero", 0);
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);
        map.put("five", 5);
        map.put("six", 6);
        map.put("seven", 7);
        map.put("eight", 8);
        map.put("nine", 9);

        StringBuilder answer = new StringBuilder();
        StringBuilder sb = new StringBuilder();

        for(char c : numbers.toCharArray()) {
            sb.append(c);

            if(map.containsKey(sb.toString())) {
                answer.append(map.get(sb.toString()));
                sb.delete(0, sb.length());
            }
        }

        return Long.parseLong(answer.toString());
    }

    public static long solution2(String numbers) {
        String[] numbers_arr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for (int i = 0; i < numbers_arr.length; i++) {
            numbers = numbers.replaceAll(numbers_arr[i], String.valueOf(i));
        }

        return Long.parseLong(numbers);
    }

    public static void main(String[] args) {
        System.out.println(solution1("onetwothreefourfivesixseveneightnine"));
    }
}
