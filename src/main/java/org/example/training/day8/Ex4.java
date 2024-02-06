package org.example.training.day8;

/**
 * 9로 나눈 나머지
 */
public class Ex4 {
    public static int solution1(String number) {
        int answer = 0;
        for (char c : number.toCharArray()) {
            answer += Integer.parseInt(String.valueOf(c));
        }
        return answer % 9;
    }

    public static int solution2(String number) {    // stream을 이용한 풀이
        return number.chars()
                .mapToObj(c -> (char) c)
                .mapToInt(c -> Integer.parseInt(String.valueOf(c)))
                .sum() % 9;
    }

    public static void main(String[] args) {
        System.out.println(solution2("78720646226947352489"));
    }
}
