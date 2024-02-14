package org.example.training.day21;

import java.util.*;
import java.util.stream.Collectors;

/**
 * 전국 대회 선발 고사
 */
public class Ex2 {
    public static int solution1(int[] rank, boolean[] attendance) {
        ArrayList<Integer> list = new ArrayList<>();
        LinkedList<Integer> origin = Arrays.stream(rank).boxed().collect(Collectors.toCollection(LinkedList::new));

        for (int i = 0; i < attendance.length; i++) {
            if(attendance[i])
                list.add(rank[i]);
        }

        Collections.sort(list);

        int a = origin.indexOf(list.get(0));
        int b = origin.indexOf(list.get(1));
        int c = origin.indexOf(list.get(2));

        return 10000 * a + 100 * b + c;
    }

    public static int solution2(int[] rank, boolean[] attendance) {     // 우선순위 큐를 이용한 풀이
        PriorityQueue<Integer> que = new PriorityQueue<>((o1, o2) -> rank[o1] - rank[o2]);
        for (int i = 0; i < attendance.length; i++) {
            if(attendance[i])
                que.add(i);
        }
        return 10000 * que.poll() + 100 * que.poll() + que.poll();
    }

    public static void main(String[] args) {
        System.out.println(solution1(new int[]{3, 7, 2, 5, 4, 6, 1}, new boolean[]{false, true, true, true, true, false, false}));
    }
}
