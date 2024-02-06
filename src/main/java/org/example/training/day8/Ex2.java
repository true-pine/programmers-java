package org.example.training.day8;

import java.util.*;
import java.util.stream.Collectors;

/**
 * 주사위 게임 3
 */
public class Ex2 {
    public static int solution1(int a, int b, int c, int d) {
        // 1. 주사위의 값을 list로 만들고 오름차순 정렬
        ArrayList<Integer> list = new ArrayList<>(List.of(a, b, c, d));
        list.sort(Comparator.comparingInt(o -> o));
        // 2. 각 주사위의 값이 중복되는 횟수를 저장하기 위한 배열 생성
        int[] countArr = new int[list.size()];
        Arrays.fill(countArr, 0);
        // 3. 배열에 중복되는 횟수를 설정
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i) == list.get(j)) {
                    countArr[i]++;
                }
            }
        }
        // 4. 주사위의 값을 key / 중복되는 횟수를 value 로 map 생성
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < countArr.length; i++) {
            map.put(list.get(i), countArr[i]);
        }
        // 5. value를 기준으로 오름차순 정렬한 Entry를 list로 변환
        List<Map.Entry<Integer, Integer>> collect = map.entrySet().stream().sorted(Comparator.comparingInt(Map.Entry::getValue)).collect(Collectors.toList());
        // 6. 각 조건에 맞는 return 값 설정
        int answer = 1;
        if (collect.size() == 1) {
            answer = 1111 * collect.get(0).getKey();
        } else if (collect.size() == 2) {
            if (collect.get(0).getValue() == 2) {
                answer = (collect.get(0).getKey() + collect.get(1).getKey()) * Math.abs(collect.get(0).getKey() - collect.get(1).getKey());
            } else {
                answer = (int) Math.pow(10 * collect.get(1).getKey() + collect.get(0).getKey(), 2);
            }
        } else if (collect.size() == 3) {
            answer = collect.get(0).getKey() * collect.get(1).getKey();
        } else if (collect.size() == 4) {
            answer = collect.stream().sorted(Comparator.comparingInt(Map.Entry::getKey)).findFirst().get().getKey();
        }

        return answer;
    }
    public static void main(String[] args) {
        System.out.println(solution1(2,2,2,2));
        System.out.println(solution1(4,1,4,4));
        System.out.println(solution1(6,3,3,6));
        System.out.println(solution1(2,5,2,6));
        System.out.println(solution1(6,4,2,5));
    }
}
