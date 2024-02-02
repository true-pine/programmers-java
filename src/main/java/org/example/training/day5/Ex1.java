package org.example.training.day5;

/**
 * 코드 처리하기
 */
public class Ex1 {
    public static String solution1(String code) {
        StringBuilder sb = new StringBuilder();
        boolean mode = false;

        for(int i = 0; i < code.length(); i++) {
            if(mode) {
                if(code.charAt(i) != '1' && i % 2 != 0) {
                    sb.append(code.charAt(i));
                } else if(code.charAt(i) == '1') {
                    mode = false;
                }
            } else {
                if(code.charAt(i) != '1' && i % 2 == 0) {
                    sb.append(code.charAt(i));
                } else if(code.charAt(i) == '1') {
                    mode = true;
                }
            }
        }

        return sb.toString().isEmpty() ? "EMPTY" : sb.toString();
    }

    public static String solution2(String code) {   // 다른 사람의 풀이를 참고하여 문제를 다시 파악 후 조건을 수정한 풀이
        StringBuilder sb = new StringBuilder();
        int mode = 0;

        for (int i = 0; i < code.length(); i++) {
            char c = code.charAt(i);
            if (c == '1') {
                mode = mode == 0 ? 1 : 0;
            } else {
                if(i % 2 == mode) {
                    sb.append(c);
                }
            }
        }

        return sb.toString().isEmpty() ? "EMPTY" : sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(solution2("abc1abc1abc"));
    }
}
