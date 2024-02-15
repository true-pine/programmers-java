package org.example.training.day22;

/**
 * 0 떼기
 */
public class Ex1 {
    public static String solution1(String n_str) {
        StringBuilder sb = new StringBuilder(n_str);
        while (sb.toString().startsWith("0")) {
            sb.delete(0, 1);
        }
        return sb.toString();
    }

    public static String solution2(String n_str) {
        return String.valueOf(Integer.parseInt(n_str));
    }

    public static void main(String[] args) {
        System.out.println(solution2("0010"));
    }
}
