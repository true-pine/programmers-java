package org.example.training.day23;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * 날짜 비교하기
 */
public class Ex5 {
    public static int solution1(int[] date1, int[] date2) {
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < date1.length; i++)
            list.add(Integer.compare(date1[i] - date2[i], 0));

        int answer = 1;

        if(!list.contains(-1))
            return 0;
        else {
            for(int i = 0; i < list.indexOf(-1); i++) {
                if(list.get(i) > 0) {
                    answer = 0;
                    break;
                }
            }
        }

        return answer;
    }

    public static int solution2(int[] date1, int[] date2) {     // LocalDate
        LocalDate a = LocalDate.of(date1[0], date1[1], date1[2]);
        LocalDate b = LocalDate.of(date2[0], date2[1], date2[2]);

        return a.isBefore(b) ? 1 : 0;
    }

    public static int solution3(int[] date1, int[] date2) {     // Arrays (* JDK 9 이상 가능)
        return Arrays.compare(date1, date2) < 0 ? 1 : 0;
    }

    public static int solution4(int[] date1, int[] date2) {     // Integer to String
        return Integer.parseInt("" + date1[0] + date1[1] + date1[2]) < Integer.parseInt("" + date2[0] + date2[1] + date2[2]) ? 1 : 0;
    }

    public static void main(String[] args) {
        System.out.println(solution3(new int[]{2022, 12, 28}, new int[]{2021, 12, 29}));
    }
}
