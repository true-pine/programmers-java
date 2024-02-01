package org.example.training.day3;

/**
 * 문자 리스트를 문자열로 변환하기
 */
public class Ex2 {
    public static String solution1(String[] arr) {
        StringBuilder sb = new StringBuilder();
        for (String s : arr) {
            sb.append(s);
        }
        return sb.toString();
    }

    public static String solution2(String[] arr) {  // 한줄 코딩 방법
        return String.join("", arr);
    }

    public static void main(String[] args) {
        System.out.println(solution1(new String[]{"a","b","c"}));
    }
}
