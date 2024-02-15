package org.example.training.day22;

import java.math.BigInteger;
import java.util.LinkedList;
import java.util.Arrays;

/**
 * 두 수의 합
 */
public class Ex2 {
    public static String solution1(String a, String b) {    // BigInteger
        return new BigInteger(a).add(new BigInteger(b)).toString();
    }

    public static String solution2(String a, String b) {    // LinkedList
        LinkedList<String> st1 = new LinkedList<>(Arrays.asList(a.split("")));
        LinkedList<String> st2 = new LinkedList<>(Arrays.asList(b.split("")));

        LinkedList<String> list = new LinkedList<>();

        int over = 0;
        for(int i = 0; i < Math.max(a.length(), b.length()); i++) {
            int num1 = st1.peekLast() == null ? 0 : Integer.parseInt(st1.pollLast());
            int num2 = st2.peekLast() == null ? 0 : Integer.parseInt(st2.pollLast());

            list.push(String.valueOf((over + num1 + num2) % 10));
            over = (over + num1 + num2) / 10;
        }

        if(over != 0)
            list.push(String.valueOf(over));

        return String.join("", list);
    }

    public static void main(String[] args) {
        System.out.println(solution2("18446744073709551615", "287346502836570928366"));
    }
}
