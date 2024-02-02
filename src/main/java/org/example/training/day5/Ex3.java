package org.example.training.day5;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 주사위 게임 2
 */
public class Ex3 {
    public static int solution1(int a, int b, int c) {
        if(a == b && b == c) {
            return (a + b + c) * (a * a + b * b + c * c) * (a * a * a + b * b * b + c * c * c);
        } else if(a != b && b != c && a != c) {
            return a + b + c;
        } else {
            return (a + b + c) * (a * a + b * b + c * c);
        }
    }

    public static int solution2(int a, int b, int c) {  // stream과 set을 이용한 풀이
        Set<Integer> numbers = Stream.of(a, b, c).collect(Collectors.toSet());

        switch (numbers.size()) {
            case 1:
                return pow(a, b, c, 3);
            case 2:
                return pow(a, b, c, 2);
            case 3:
                return pow(a, b, c, 1);
            default:
                return -1;
        }
    }

    private static int pow(int a, int b, int c, int exp) {
        int result = 1;
        for (int i = 1; i <= exp; i++) {
            result *= (Math.pow(a, i) + Math.pow(b, i) + Math.pow(c, i));
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(solution2(4, 4, 4));
    }
}
