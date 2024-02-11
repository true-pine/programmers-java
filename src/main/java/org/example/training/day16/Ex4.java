package org.example.training.day16;

import java.util.stream.Collectors;

/**
 * A 강조하기
 */
public class Ex4 {
    public static String solution1(String myString) {   // for-loop
        StringBuilder sb = new StringBuilder();

        for (char c : myString.toCharArray()) {
            if(c == 'a')
                sb.append("A");
            else if(c != 'A' && Character.isUpperCase(c))
                sb.append(Character.toLowerCase(c));
            else
                sb.append(c);
        }

        return sb.toString();
    }

    public static String solution2(String myString) {   // stream
        return myString.chars()
                .mapToObj(c -> (char) c)
                .map(c -> {
                    if(c == 'a')
                        return "A";
                    else if(c != 'A' && Character.isUpperCase(c))
                        return String.valueOf(Character.toLowerCase(c));
                    else
                        return String.valueOf(c);
                }).collect(Collectors.joining());
    }

    public static void main(String[] args) {
        System.out.println(solution2("PrOgRaMmErS"));
    }
}
