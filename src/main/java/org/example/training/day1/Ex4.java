package org.example.training.day1;

import java.util.Scanner;

public class Ex4 {
    public static String changeCase(String str) {   // 나의 풀이
        char[] chars = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) >= 65 && str.charAt(i) <= 90) {
                chars[i] = (char) (str.charAt(i) + 32);
            } else if(str.charAt(i) >= 97 && str.charAt(i) <= 122) {
                chars[i] = (char) (str.charAt(i) - 32);
            }
        }

        return new String(chars);
    }

    public static String changeCase2(String str) {  // Character 클래스를 이용한 풀이
        StringBuilder sb = new StringBuilder();

        for (char c : str.toCharArray()) {
            if(Character.isLowerCase(c)) {
                sb.append(Character.toUpperCase(c));
            } else if (Character.isUpperCase(c)) {
                sb.append(Character.toLowerCase(c));
            }
        }

        return sb.toString();
    }

    public static String changeCase3(String str) {  // 문자로 비교하는 풀이
        StringBuilder sb = new StringBuilder();

        for (char c : str.toCharArray()) {
            if(c >= 'A' && c <= 'Z') {
                sb.append((char) (c + 32));
            } else if (c >= 'a' && c <= 'z') {
                sb.append((char) (c - 32));
            }
        }

        return sb.toString();
    }

    public static void changeCase4(String str) {    // stream을 이용한 풀이
        str.chars()
                .mapToObj(c -> (char) c)
                .map(c -> Character.isLowerCase(c) ? Character.toUpperCase(c) : Character.toLowerCase(c)).forEach(System.out::print);
    }

    public static String changeCase5(String str) {  // 정규식을 이용한 풀이
        StringBuilder sb = new StringBuilder();

        for (char c : str.toCharArray()) {
            String s = String.valueOf(c);

            if (s.matches("[A-Z]")) {
                sb.append(s.toLowerCase());
            } else if (s.matches("[a-z]")) {
                sb.append(s.toUpperCase());
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        System.out.println(changeCase5(a));
//        changeCase4(a);
    }
}
