package org.example.training.day14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * 할 일 목록
 */
public class Ex3 {
    public static String[] solution1(String[] todo_list, boolean[] finished) {      // for-loop
        ArrayList<String> answer = new ArrayList<>();

        for(int i = 0; i < todo_list.length; i++) {
            if(!finished[i]) answer.add(todo_list[i]);
        }

        return answer.toArray(new String[0]);
    }

    public static String[] solution2(String[] todo_list, boolean[] finished) {      // stream
        return IntStream.range(0, finished.length)
                .filter(i -> !finished[i])
                .mapToObj(i -> todo_list[i])
                .toArray(String[]::new);
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution2(new String[]{"problemsolving", "practiceguitar", "swim", "studygraph"}, new boolean[]{true, false, true, false})));
    }
}
