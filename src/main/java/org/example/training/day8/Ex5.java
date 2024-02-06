package org.example.training.day8;

/**
 * 문자열 여러 번 뒤집기
 */
public class Ex5 {
    public static String solution1(String my_string, int[][] queries) {
        StringBuilder sb = new StringBuilder(my_string);

        for (int[] query : queries) {
            sb.replace(query[0], query[1] + 1, new StringBuilder(sb.substring(query[0], query[1] + 1)).reverse().toString());
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(solution1("rermgorpsam", new int[][]{{2, 3}, {0, 7}, {5, 9}, {6, 10}}));
    }
}
