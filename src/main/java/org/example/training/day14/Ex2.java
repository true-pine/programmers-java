package org.example.training.day14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * 5명씩
 */
public class Ex2 {
    public static String[] solution1(String[] names) {      // for-loop
        ArrayList<String> answer = new ArrayList<>();

        for(int i = 0; i < names.length; i += 5) {
            answer.add(names[i]);
        }

        return answer.toArray(new String[0]);
    }

    public static String[] solution2(String[] names) {      // stream
        return IntStream.range(0, names.length).filter(i -> i % 5 == 0)
                .mapToObj(i -> names[i])
                .toArray(String[]::new);
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution2(new String[]{"nami", "ahri", "jayce", "garen", "ivern", "vex", "jinx"})));
    }
}
