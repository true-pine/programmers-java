package org.example.training.day10;

/**
 * qr code
 */
public class Ex5 {
    public static String solution1(int q, int r, String code) {
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < code.length(); i++) {
            if(i % q == r) {
                sb.append(code.charAt(i));
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {

    }
}
