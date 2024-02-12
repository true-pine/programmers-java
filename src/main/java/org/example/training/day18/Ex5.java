package org.example.training.day18;

/**
 * rny_string
 */
public class Ex5 {
    public static String solution1(String rny_string) {
        return rny_string.replace("m", "rn");
    }

    public static void main(String[] args) {
        System.out.println(solution1("masterpiece"));
    }
}
