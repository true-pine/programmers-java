package org.example.beginner.day9;

import java.util.List;

/**
 * 모스부호 (1)
 */
public class Ex2 {
    public static String solution1(String letter) {
        List<String> morse = List.of(".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--..");

        StringBuilder sb = new StringBuilder();

        for(String s : letter.split(" ")) {
            sb.append((char) ('a' + morse.indexOf(s)));
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(solution1(".... . .-.. .-.. ---"));
    }
}
