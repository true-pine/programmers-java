package org.example.training.day18;

/**
 * 간단한 식 계산하기
 */
public class Ex3 {
    public static int solution1(String binomial) {
        String[] split = binomial.split(" ");
        switch(split[1]) {
            case "+":
                return Integer.parseInt(split[0]) + Integer.parseInt(split[2]);
            case "-":
                return Integer.parseInt(split[0]) - Integer.parseInt(split[2]);
            case "*":
                return Integer.parseInt(split[0]) * Integer.parseInt(split[2]);
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        System.out.println(solution1("43 + 12"));
    }
}
