package org.example.beginner.day9;

/**
 * 가위 바위 보
 */
public class Ex3 {
    public static String solution1(String rsp) {
        StringBuilder sb = new StringBuilder();

        for(char c : rsp.toCharArray()) {
            switch(c) {
                case '2':
                    sb.append("0");
                    break;
                case '0':
                    sb.append("5");
                    break;
                case '5':
                    sb.append("2");
                    break;
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(solution1("205"));
    }
}
