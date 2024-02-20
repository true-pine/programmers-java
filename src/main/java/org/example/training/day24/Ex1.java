package org.example.training.day24;

/**
 * 커피 심부름
 */
public class Ex1 {
    public static int solution1(String[] order) {
        int answer = 0;

        for(String ord : order) {
            if(ord.contains("americano"))
                answer += 4500;
            else if(ord.contains("cafelatte"))
                answer += 5000;
            else if(ord.contains("anything"))
                answer += 4500;
        }

        return answer;
    }

    public static int solution2(String[] order) {
        int answer = 0;

        for (String s : order) {
            if(s.contains("cafelatte"))
                answer += 5000;
            else
                answer += 4500;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution2(new String[]{"cafelatte", "americanoice", "hotcafelatte", "anything"}));
    }
}
