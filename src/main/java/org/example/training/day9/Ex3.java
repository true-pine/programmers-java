package org.example.training.day9;

/**
 * 문자열의 뒤의 n글자
 */
public class Ex3 {
    public static String solution1(String my_string, int n) {
        StringBuilder sb = new StringBuilder();

        int idx = my_string.length() - 1;
        while(sb.length() < n) {
            sb.append(my_string.charAt(idx--));
        }

        return sb.reverse().toString();
    }

    public static String solution2(String my_string, int n) {
        return my_string.substring(my_string.length() - n);
    }

    public static void main(String[] args) {
        System.out.println(solution2("ProgrammerS123", 11));
    }
}
