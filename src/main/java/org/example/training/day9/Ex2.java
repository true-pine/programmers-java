package org.example.training.day9;

/**
 * 부분 문자열 이어 붙여 문자열 만들기
 */
public class Ex2 {
    public static String solution1(String[] my_strings, int[][] parts) {
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < parts.length; i++) {
//            sb.append(my_strings[i].substring(parts[i][0], parts[i][1] + 1));
            sb.append(my_strings[i], parts[i][0], parts[i][1] + 1);
        }

        return sb.toString();
    }
    public static void main(String[] args) {

    }
}
