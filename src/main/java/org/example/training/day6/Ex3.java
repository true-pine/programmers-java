package org.example.training.day6;

/**
 * 수 조작하기 2
 */
public class Ex3 {
    public static String solution1(int[] numLog) {
        StringBuilder sb = new StringBuilder();

        for(int i = 1; i < numLog.length; i++) {
            switch(numLog[i] - numLog[i - 1]) {
                case 1: sb.append("w"); break;
                case -1: sb.append("s"); break;
                case 10: sb.append("d"); break;
                case -10: sb.append("a"); break;
                default: break;
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(solution1(new int[]{0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1}));
    }
}
