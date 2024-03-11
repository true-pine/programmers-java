package org.example.beginner.day16;

/**
 * 문자열 계산하기
 */
public class Ex3 {
    enum FLAG { PLUS, MINUS }

    public static int solution1(String my_string) {
        String[] split = my_string.split(" ");

        int answer = 0;
        FLAG flag = FLAG.PLUS;

        for(String s : split) {
            switch(s) {
                case "+":
                    flag = FLAG.PLUS;
                    break;
                case "-":
                    flag = FLAG.MINUS;
                    break;
                default:
                    if(flag == FLAG.PLUS)
                        answer += Integer.parseInt(s);
                    else
                        answer -= Integer.parseInt(s);
                    break;
            }
        }

        return answer;
    }

    public static int solution2(String my_string) {
        String[] split = my_string.split(" ");

        int answer = 0;
        boolean isPlus = true;

        for (int i = 0; i < split.length; i++) {
            if(i % 2 == 0) {
                answer += isPlus ? Integer.parseInt(split[i]) : -Integer.parseInt(split[i]);
            } else {
                isPlus = split[i].equals("+");
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution1("3 + 4"));
    }
}
